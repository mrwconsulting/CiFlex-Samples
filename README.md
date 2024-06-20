## **Website: https://www.npmjs.com/package/@ciflex/ciflexctl**

## **Pipeline Samples:**

List of plugins implemented by all samples: <br>
1.  pluginName: SAST-Codacy <br>
    pluginAliasName: SAST-Codacy <br>
    isActive: false <br>

2.  pluginName: SAST-Snyk <br>
    pluginAliasName: SAST-Snyk <br>
    isActive: false

3.  pluginName: 4.27-DinD <br>
    pluginAliasName: REGISTRY-DockerHub <br>
    isActive: false <br>

4.  pluginName: 4.27-DinD <br>
    pluginAliasName: REGISTRY-GitHub <br>
    isActive: false <br>

5.  pluginName: Manual-Approval <br>
    isActive: false <br>

6.  pluginName: EKS-Deployment <br>
    pluginAliasName: EKS <br>
    isActive: false <br>

List of plugins implemented by specific samples: <br>
1. springboot-maven <br>
    pluginName: 3.9-Maven <br>
    pluginAliasName: OpenJDK <br>
    isActive: true <br>

    pluginName: 0.18-Trivy:Maven <br>
    pluginAliasName: TRIVY-JiB <br>
    isActive: false <br>

    pluginName: 0.18-Trivy:Maven <br>
    pluginAliasName: TRIVY-BuildPack <br>
    isActive: true <br>

2. springboot-kotlin <br>
    pluginName: 8.5-Gradle <br>
    pluginAliasName: OpenJDK <br>
    isActive: true <br>

3. springboot-gradle <br>
    pluginName: 8.5-Gradle <br>
    pluginAliasName: OpenJDK <br>
    isActive: true <br>

4. python-poety <br>
    pluginName: 3.12-Poetry <br>
    pluginAliasName: Python <br>
    isActive: true <br>

5. python-pip <br>
    pluginName: 3.12-PiP <br>
    pluginAliasName: Python <br>
    isActive: true <br>

### **Prerequisites**

- [CiFlexCtl](https://www.npmjs.com/package/@ciflex/ciflexctl)
- **CiFlex Token**: _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_ (30-Day License)

### **Provision Pipeline**
```bash
export AWS_ACCESS_KEY_ID=<AWS_ACCESS_KEY_ID>
export AWS_SECRET_ACCESS_KEY=<AWS_SECRET_ACCESS_KEY>

cd springboot-maven
../bin/access-token.sh 
export CIFLEX_ACCESS_TOKEN=<CIFLEX_ACCESS_TOKEN>
ciflexctl pipeline --deploy
```

### **Links**
[API Docs](docs/README.md)