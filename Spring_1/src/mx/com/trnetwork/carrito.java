package mx.com.trnetwork;

import java.util.HashMap;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class carrito {
		HashMap<String, Integer> productos ;
		Integer cantidad;
	
		@Autowired
		protected HttpSession httpSession;
		
		//Permite proveer una variable para mantener viva un inicio de sesesion
		
		public void add(String producto) {
				Integer cantidad;
				productos=getProducto();
				
				if(!productos.containsKey(producto)) {
					cantidad = 0;
				}else {
					cantidad = productos.get(producto);
				}
				productos.put(producto, cantidad+1);	
		}
		
		public void remove(String producto) {
//			Integer cantidad;
//			productos.getProducto();
//			if(!productos.containsKey(producto)) {
//				cantidad = 0;
//			}else {
//				cantidad = productos.get(producto);
//			}
//			productos.put(producto, cantidad-1);	
		}
		
		public HashMap<String, Integer> getProducto(){
			productos = (HashMap<String, Integer>) httpSession.getAttribute("producto");
			
			if(productos!=null) {
				productos = new HashMap<String, Integer>();
				httpSession.setAttribute("productos", productos);
			}
			return productos;
		}	
	}

		