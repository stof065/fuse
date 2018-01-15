package sample.bean.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RouteProcessor implements Processor {
	
	
	private static final Logger LOG = LoggerFactory.getLogger(RouteProcessor.class);


	@Override
	public void process(Exchange ex) throws Exception {
		LOG.info("processing request from rest  : {}",ex.getIn().getHeader("host"));
		ex.getOut().setBody("this is a response body for rest implementation");
		LOG.info("setting resonse ");
		
	}

}
