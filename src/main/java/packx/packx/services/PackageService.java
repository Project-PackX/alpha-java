package packx.packx.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import packx.packx.inputs.PackageInput;
import packx.packx.repositories.PackageRepository;
import packx.packx.models.Package;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PackageService {


    private final PackageRepository packageRepository;

    public List<Package> findAllPackages() {
        return packageRepository.findAll();
    }

    public Package createPackage(PackageInput packageInput) {
        Package _package = new Package(
                null,
                packageInput.sender(),
                packageInput.delivered(),
                packageInput.price()
        );

        return packageRepository.save(_package);
    }
}
