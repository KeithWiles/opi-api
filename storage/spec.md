# OPI Storage Interface

Authors:
* Boris Glimcher <<boris.glimcher@dell.com>> (@glimchb)
* tbd...

## Notational Conventions

tbd

## Terminology

| Term              | Definition                                       |
|-------------------|--------------------------------------------------|
| Block Volume      | A volume that will appear as a block device inside the host OS.                                                     |
| tbd               | tbd                                              |

## Objective

To define an industry standard “OPI Storage Interface” for IPUs/DPUs that will enable DPU vendors to develop a plugin once and have it work across a number of orchestration systems.

### Goals in MVP

tbd..

### Non-Goals in MVP

tbd...

## Solution Overview

tbd...

### Architecture

![Storage Services Offload Use Case](../doc/minutes/images/API-Storage-Use-Case.png)

Following CRUD API (CREATE, READ, UPDATE, and DELETE)

We do want this to be gRPC with protobuf based...

tbd...

### Front End (host-facing)

This DPU emulated devices representation to the host.
It should have all the correct controllable parameters according to NVMe spec.

#### `NVMe Subsystem Create`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |
| string         | SN                  | Subsystem Serial Number                      |
| string         | Model               | Subsystem Model Number                       |
| string         | Max NS              | Maximum namespaces allowed in this subsystem |

#### `NVMe Subsystem Delete`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |

#### `NVMe Subsystem Update`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |
| string         | SN                  | Subsystem Serial Number                      |
| string         | Model               | Subsystem Model Number                       |
| string         | Max NS              | Maximum namespaces allowed in this subsystem |

#### `NVMe Subsystem List`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|

#### `NVMe Subsystem Get`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |

#### `NVMe Controller Create`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |
| string         | Controller ID       | Unique controller ID                         |
| string         | PCIe ID             | Controller PCIe ID (bus, device, PF, VF)     |
| number         | MaxIOQPs            | Max IO queue pairs (SQ/CQ) supported         |
| number         | MaxNS               | Max number of namespaces for this controller |

#### `NVMe Controller Delete`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |
| string         | Controller ID       | Unique controller ID                         |

#### `NVMe Controller Update`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |
| string         | Controller ID       | Unique controller ID                         |
| string         | PCIe ID             | Controller PCIe ID (bus, device, PF, VF)     |
| number         | MaxIOQPs            | Max IO queue pairs (SQ/CQ) supported         |
| number         | MaxNS               | Max number of namespaces for this controller |

#### `NVMe Controller List`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |

#### `NVMe Controller Get`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |
| string         | Controller ID       | Unique controller ID                         |

#### `NVMe Namespace Create`

| Type           | Parameter           | Details                                       | 
|----------------|---------------------|-----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                          |
| string         | Controller ID       | Unique controller ID                          |
| string         | NSID                | namespace ID                                  |
| string         | BDEV                | Block device that backing this namespace      |
| number         | BlockSize           | Block Size of each block (Defaults to 4KiB)   |
| number         | NumBlocks           | Size/Capacity of the namespace in blocks      |
| string         | NGUID               | namespace globally unique identifier          |
| string         | EUI64               | namespace EUI-64 identifier                   |
| string         | UUID                | namespace UUID                                |
| string         | Multipath           | TBD RESERVED                                  |
| string         | Security/Auth       | TBD RESERVED                                  |

#### `NVMe Namespace Delete`

| Type           | Parameter           | Details                                       | 
|----------------|---------------------|-----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                          |
| string         | Controller ID       | Unique controller ID                          |
| string         | NSID                | namespace ID                                  |

#### `NVMe Namespace Update`

| Type           | Parameter           | Details                                       | 
|----------------|---------------------|-----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                          |
| string         | Controller ID       | Unique controller ID                          |
| string         | NSID                | namespace ID                                  |
| string         | BDEV                | Block device that backing this namespace      |
| number         | BlockSize           | Block Size of each block (Defaults to 4KiB)   |
| number         | NumBlocks           | Size/Capacity of the namespace in blocks      |
| string         | NGUID               | namespace globally unique identifier          |
| string         | EUI64               | namespace EUI-64 identifier                   |
| string         | UUID                | namespace UUID                                |
| string         | Multipath           | TBD RESERVED                                  |
| string         | Security/Auth       | TBD RESERVED                                  |

#### `NVMe Namespace List`

| Type           | Parameter           | Details                                       | 
|----------------|---------------------|-----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                          |
| string         | Controller ID       | Unique controller ID                          |

#### `NVMe Namespace Get`

| Type           | Parameter           | Details                                       | 
|----------------|---------------------|-----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                          |
| string         | Controller ID       | Unique controller ID                          |
| string         | NSID                | namespace ID                                  |

### Back End (network-facing)

tbd...


### Middle End (Storage Services)

tbd...
