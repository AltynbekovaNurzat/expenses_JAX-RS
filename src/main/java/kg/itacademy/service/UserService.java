package kg.itacademy.service;

import kg.itacademy.dao.UserDao;
import kg.itacademy.model.Response;
import kg.itacademy.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/users")
public class UserService {

    @GET
    @Produces({ MediaType.APPLICATION_JSON})
    public Response getUsers_JSON() {
        System.out.println("We are here");
        List<User> listOfUsers = UserDao.getAllUser();
        return new Response("OK", listOfUsers);
    }

    @GET
    @Path("/{userId}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response getUser(@PathParam("userId") Integer UserId) {
        return new Response("ok", "answer",UserDao.getUser(UserId));
    }

    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public User addUser(User user) {

        return UserDao.addUser(user);
    }

    @PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public User updateUser(User user) {
        return UserDao.updateUser(user);
    }

    @DELETE
    @Path("/{userId}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void deleteUser(@PathParam("userId") Integer userId) {
        UserDao.deleteUser(userId);
    }

}