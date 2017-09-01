package org.achillesfx.core.app.context;

import java.net.URL;

/**
 * @description
 * @create 2017-08-19 下午12:15
 * @email spartajet.guo@gmail.com
 */
public abstract class Context {

    public String getPath() {
        return this.getClass().getResource("/").getPath();
    }

    public String getResourcePath(String resourceName) {
        return this.getClass().getResource(resourceName).getPath();
    }

    public URL getResource(String resourceName) {
        return this.getClass().getResource(resourceName);
    }

}
