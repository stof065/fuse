package sample.bean.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FirstRoutComponent extends RouteBuilder {
	
	
	private static final Logger LOG = LoggerFactory.getLogger(FirstRoutComponent.class);

	@Override
	public void configure() throws Exception {
		
		
		from("activemq:input").process(new Processor() {
			
			@Override
			public void process(Exchange ex) throws Exception {
				LOG.info("message executed : {}",ex.getIn());
			}
		}).to("activemq:output");
		
	}

}
