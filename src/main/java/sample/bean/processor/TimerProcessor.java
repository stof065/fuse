package sample.bean.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimerProcessor implements Processor {

	private static final Logger log = LoggerFactory.getLogger(TimerProcessor.class);
	
	private static Integer iteration  = 0 ; 

	@Override
	public void process(Exchange arg0) throws Exception {
		
		log.info("exchange : {} of iteration : {}",arg0,iteration);
		arg0.getIn().setBody("this is a modification by processor body " + iteration);
		iteration++;

	}

}
