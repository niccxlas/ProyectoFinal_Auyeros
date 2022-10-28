
package com.portfolio.nicoauyeros.Security.Repository;

import com.portfolio.nicoauyeros.Security.Entity.Rol;
import com.portfolio.nicoauyeros.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
