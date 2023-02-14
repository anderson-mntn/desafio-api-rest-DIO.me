package one.digitalinnovation.gof.model;


public class Usuario {
    private String login;
    private String password;
    // private Movie movies;

   

    // public void setMovies(Movie movies) {
    //     this.movies = movies;
    // }

    public Usuario() {}
    
    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
