package com.unla.travelweb.models;

import java.util.List;

import com.unla.travelweb.entities.Actividad;
import com.unla.travelweb.entities.Aerolinea;
import com.unla.travelweb.entities.CalificacionActividad;
import com.unla.travelweb.entities.CalificacionAerolinea;

public class Functions {

	public Functions() {}

	 public static double valoracionesXaerolinea(Aerolinea a, List<CalificacionAerolinea> calificaciones) {
			int cnt = 0;
			double totalv = 0;
			for (CalificacionAerolinea c : calificaciones) {
				if (c.getAerolinea().getId() == a.getId()) {
					cnt++;
					totalv += c.getValoracion();
				}
			}
			if (cnt == 0) {
				
				return a.getValoracion();
			} else
				return (totalv / cnt)/10;
		}

	 public static double valoracionesXactividad(Actividad a, List<CalificacionActividad> calificaciones) {
			int cnt=0;
			double totalv=0;
			for(CalificacionActividad c : calificaciones) {
				if(c.getActividad().getId()==a.getId()) {
					cnt++;
					totalv+=c.getValoracion();
				}
			}
			if(cnt==0) {
				return a.getValoracion();
			}
			else return (totalv/cnt)/10;
		}

}
