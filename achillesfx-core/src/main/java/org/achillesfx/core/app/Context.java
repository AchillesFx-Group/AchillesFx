package org.achillesfx.core.app;

/**
 * @description
 * @create 2017-08-19 下午12:15
 * @email spartajet.guo@gmail.com
 */
public abstract class Context {

    public String getPath() {
        return this.getClass().getResource("/").getPath();
    }

}
