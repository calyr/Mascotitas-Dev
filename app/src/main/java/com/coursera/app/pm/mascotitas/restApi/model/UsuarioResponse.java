package com.coursera.app.pm.mascotitas.restApi.model;

/**
 * <p> The UsuarioResponse class</p>
 * <p> Nuevatel PCS de Bolivia S.A. (c) 2016.</p>
 * <p/>
 * <p>El contenido de este archivo esta clasificado como: </p>
 * <p> INFORMACION DE CONFIDENCIALIDAD ALTA </p>
 *
 * @author Roberto Carlos Callisaya Mamani
 * @version 1.0
 */
public class UsuarioResponse {
    private String id;
    private String token;
    private String userInstagram;

    public String getUserInstagram() {
        return userInstagram;
    }

    public void setUserInstagram(String userInstagram) {
        this.userInstagram = userInstagram;
    }

    public UsuarioResponse(String id, String token, String userInstagram) {
        this.id = id;
        this.token = token;
        this.userInstagram = userInstagram;

    }

    public UsuarioResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
