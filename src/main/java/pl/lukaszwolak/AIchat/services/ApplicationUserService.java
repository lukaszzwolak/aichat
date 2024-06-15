package pl.lukaszwolak.AIchat.services;

import org.springframework.stereotype.Service;
import pl.lukaszwolak.AIchat.etenties.ApplicationUser;
import pl.lukaszwolak.AIchat.repositories.ApplicationUserRepository;

@Service
public class ApplicationUserService extends CrudService<ApplicationUserRepository, ApplicationUser> {

}
