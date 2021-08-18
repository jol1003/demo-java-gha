package pe.farmaciasperuanas.fpsappwsaltacliente.interceptor.jpa;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.farmaciasperuanas.fpsappwsaltacliente.entity.base.BaseEntity;

@Component
public class AltaClienteEntityInterceptor extends EmptyInterceptor {

	    @Override
	    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {

	        if (entity instanceof BaseEntity) {

	            for (int i = 0; i < propertyNames.length; i++) {
	            	
	                String propertyName = propertyNames[i];
	                
	                if (propertyName.equals("fechaCreacion")) {
	                    state[i] = new Timestamp(System.currentTimeMillis());
	                }
	            }
	        }
	        return true;
	    }

	
}
