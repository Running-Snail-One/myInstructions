package com.com.observermodel;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/15 16:34
 * @modified By：
 */
public interface Observer {
    public void update(float temperature, float humidity, float presure);
}
