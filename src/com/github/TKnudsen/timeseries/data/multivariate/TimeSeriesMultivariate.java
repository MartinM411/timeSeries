package com.github.TKnudsen.timeseries.data.multivariate;

import java.util.List;

import com.github.TKnudsen.timeseries.data.TimeSeries;

/**
 * <p>
 * Title: TimeSeriesMultivariate
 * </p>
 * 
 * <p>
 * Description: TimeSeriesMultivariate interface
 * </p>
 * 
 * <p>
 * Copyright: Copyright (c) 2016
 * </p>
 * 
 * @author Juergen Bernard
 * @version 1.01
 */
public interface TimeSeriesMultivariate extends TimeSeries<List<Double>> {

	public int getDimensionality();

	public List<TimeSeries<Double>> getTimeSeriesList();

	public TimeSeries<Double> getTimeSeries(String attributeName);

	public List<String> getAttributeNames();

	public String getAttributeName(int attributeIndex);

	public List<String> getAttributeDescriptions();

	public String getAttributeDescriptions(int attributeIndex);

	public Double getValue(int index, String attribute);
}