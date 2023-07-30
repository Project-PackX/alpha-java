package packx.packx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import packx.packx.models.Package;

import java.util.UUID;

@Repository
public interface PackageRepository extends JpaRepository<Package, UUID> {

}
