package com.jd.myDocker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "resource")
public class ResourceEntity {

    @Id
}
