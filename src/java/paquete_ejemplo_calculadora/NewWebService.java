/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_ejemplo_calculadora;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;
import net.webservicex.Airport;
import net.webservicex.AirportSoap;

/**
 *
 * @author Fernando
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String[] obtenerCiudad(@WebParam(name = "operando1") String operando1){
        String[] resultado = new String[2];
        GlobalWeather gw = new GlobalWeather();
        Airport ar = new Airport();
        GlobalWeatherSoap gws =  gw.getGlobalWeatherSoap();
        AirportSoap ars = ar.getAirportSoap();
        resultado[0] = gws.getCitiesByCountry(operando1);
        
        resultado[1] = ars.getAirportInformationByCountry(operando1);

        
        return resultado;
    }
}
