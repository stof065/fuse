package sample.bean.processor;

import javax.sql.DataSource;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sample.bean.repository.DummyRepository;

public class ProcessingBean implements Processor {

	private static final Logger LOG = LoggerFactory.getLogger(ProcessingBean.class);

	private DataSource dataSource;
	
	private DummyRepository dummyRepository;

	public String insertMessage(String messge) throws Exception {
		LOG.info("start processing request : {}",dummyRepository.findAll());
		// Connection ct = dataSource.getConnection();
		// PreparedStatement statemet = ct.prepareStatement("INSERT INTO `test`
		// (`test`) VALUES ('" + messge + "');");
		// statemet.executeUpdate();
		// LOG.info("executed request");
		return "OK";

	}

	public void startingBean() {
		LOG.info("init datasource bean ");
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void process(Exchange arg0) throws Exception {

		// log all user
		// userRepository.findAll().stream().map(Object::toString).forEach(LOG::info);

		LOG.info("start processing request : {}", arg0.getIn());
		insertMessage(arg0.getIn().getBody().toString());
		LOG.info("end processing request : {}", arg0.getIn());

	}

	public DummyRepository getDummyRepository() {
		return dummyRepository;
	}

	public void setDummyRepository(DummyRepository dummyRepository) {
		this.dummyRepository = dummyRepository;
	}
	
	

}
