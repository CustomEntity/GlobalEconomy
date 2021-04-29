package fr.customentity.globaleconomy.api.model.user;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface UserManager {

    @NonNull CompletableFuture<User> loadUser(@NonNull UUID uuid);

    @NonNull Optional<User> getUser(@NonNull UUID uuid);

    @NonNull Optional<User> getUser(@NonNull String username);


}
