/*
 * Copyright (C) 2015 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.pdsw.patterns.visualizadorfinanciero;

import java.util.Enumeration;
import org2.awesomecompany.dataviewer.datachartanalyzer.DataAnalyzer;
import org2.awesomecompany.defaultdatasources.CloudStockData;
import org2.supersmartcompany.dataminer.dataextractor.DataExtractor;

/**
 *
 * @author hcadavid
 */
public class VisualizadorFiananciero {
    
    public static void main(String args[]){
        DataAnalyzer dana=new DataAnalyzer();
        
        //Fuente de datos disponible por defecto
        CloudStockData defaultDataSource = new CloudStockData();
        
        DataExtractor dext = new DataExtractor();
        Enumeration<Double> data=dext.extractDataFromBigData();
        
        IteratorEnumerationAdapter adapter = new IteratorEnumerationAdapter(data);
        
        //Procesar datos dados por el iterador de la fuente de datos
        dana.processData(adapter);        
    }
    
}
