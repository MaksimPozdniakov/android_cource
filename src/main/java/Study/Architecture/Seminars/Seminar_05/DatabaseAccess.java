package Study.Architecture.Seminars.Seminar_05;

import java.util.Collection;

public interface DatabaseAccess {

    void addEntity(Entity entity, String description);
    void removeEntity(Entity entity);
    Collection<Texture> getAllTextures();
    Collection<Model3D> getAllModels();
}
