package packx.packx.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import packx.packx.inputs.PackageInput;
import packx.packx.services.PackageService;
import packx.packx.models.Package;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/packages")
public class PackageController {

    private final PackageService packageService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Package> findAllPackages() {
        return packageService.findAllPackages();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Package createPackage(@RequestBody PackageInput packageInput) {
        return packageService.createPackage(packageInput);
    }
}
