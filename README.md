## **CICD Platform**
![ciflex-platform](https://github.com/user-attachments/assets/c42d1dde-a8d4-4f85-973a-4634961e8c26)

The CiFlex CICD Platform is an AWS CodePipeline generator, streamlining pipeline creation by simplifying configuration for tasks such as building, unit testing, code style linting, and deploying. It's a fully managed continuous delivery service that automates AWS CodePipeline infrastructure, empowering DevOps teams to efficiently manage and automate their pipeline processes. With CiFlex, DevOps teams can create and publish plugins to introduce new features, enabling application teams to easily enhance their CICD workflows.

## **Benefits:**

* **Self-Mutating CICD Pipeline**: CiFlex plugins can be dynamically added, updated with new values, or removed without coding, enabling a pipeline to reconfigure itself to deploy new or updated stages. Pipelines will automatically update based on configuration files submitted by application teams.

* **Plugin-Based Architecture**: With a plugin-based architecture, DevOps teams can effortlessly extend functionality by creating or modifying plugins. This empowers application teams to swiftly incorporate new capabilities into their pipelines, adapting to changing requirements with ease.

* **Authorization**: CiFlex prioritizes security by leveraging AWS Cognito services to protect its APIs with JSON Web Tokens (JWT). This ensures that application teams must authenticate to create and provision pipelines, guaranteeing secure access and maintaining data integrity.

* **AWS Service Catalog Integration**: Streamline pipeline creation and provisioning with seamless integration into the AWS Service Catalog. Centralize management of pipeline resources to enhance efficiency and governance for application teams.

* **Pipeline-Level Variables** : Both stages and steps expose pipeline variables to be easily consumed by other stages and steps. These pipeline-level variables are fully customizable, allowing you to define their names and values.

* **Command-Line Inteface**: A unified tool that offers a consistent interface for interacting with CiFlex APIs.
  
* **Technology**: CDK,Cognito,CloudFormation,CodeBuild,CodePipeline,Service Catalog

### **AWS Service Catalog Integration**

[![](https://img.youtube.com/vi/flOQveVQ04Q/0.jpg)](https://www.youtube.com/embed/flOQveVQ04Q?fs=0&autoplay=1&loop=1)

### **Dynamically Configure AWS CodePipeline**

[![](https://img.youtube.com/vi/U3SrheFSuDg/0.jpg)](https://www.youtube.com/embed/U3SrheFSuDg?fs=0&autoplay=1&loop=1)

### **Prerequisites**
- [NodeJS Version 20.12.1 or greater](https://nodejs.org/en/)
- [Docker Desktop Version 24.0.2 or greater](https://docs.docker.com/engine/install/)
- [AWS CLI Version 2.11.6 or greater](https://docs.aws.amazon.com/cli/latest/userguide/getting-started-install.html)
- **CiFlex Token**: xxxxxxxxxxxxxxxxxxxxxxxxxxxx (email: support@mrwconsulting.tech)
  
### **Usage**
```bash
export CIFLEX_TOKEN=xxxxxxxxxxxxxxxxxxxxxxxxxxxx

npm config set //npm.pkg.github.com/:_authToken $CIFLEX_TOKEN
npm config set @mrwconsulting:registry https://npm.pkg.github.com/
npm install @ciflex/ciflexctl --global

ciflexctl --help
ciflexctl --version
```
### **Platform Setup**
1. Request CiFlex Token: (email: support@mrwconsulting.tech)
2. Install CiFlex Platform:

    ```bash
    export AWS_ACCESS_KEY_ID=<AWS_ACCESS_KEY_ID>
    export AWS_SECRET_ACCESS_KEY=<AWS_SECRET_ACCESS_KEY>
    export CIFLEX_TOKEN=xxxxxxxxxxxxxxxxxxxxxxxxxxxx

    npm config set //npm.pkg.github.com/:_authToken $CIFLEX_TOKEN
    npm config set @mrwconsulting:registry https://npm.pkg.github.com/
    npm install @ciflex/ciflexctl --global

    ciflexctl platform --setup --vpcId <VPC_ID>
    ```
    Detected vpc id: <VPC_ID> <br>
    Verify toolkit stack... <br>
    Toolkit stack exists.. 
    
    ✨  Synthesis time: 7.06s <br>
    stack (ciflex-platform-stack): deploying... [1/1] <br>
    ciflex-platform-stack: creating CloudFormation changeset... 
    
    ✅  stack (ciflex-platform-stack) <br>
    ✨  Deployment time: 309.76s 
    
    Outputs: <br>
    stack.restapiEndpoint7C8BD49C = _<https...>_ <br>
    ✨  Total time: 325.35s 

    Do you want to install cognito admin account? [y/N]**y** <br>
    Enter cognito username: [admin] <br>
    Enter cognito email: [support@mrwconsulting.tech] <br>
    Enter cognito password: [Password01!] 
    
    Cognito account configured: _<arn...>_ <br>
    Do you want to load default plugins? [y/N]**y** <br>
    Creating dynamodb table: ciflex-registry <br>
    Loading default plugins... 
    
    Do you want to initialize catalog repository? [y/N]**y** 

    ✨  Synthesis time: 5.32s 

    ciflex-catalog-stack: deploying... [1/1] <br>
    ciflex-catalog-stack: creating CloudFormation changeset... 

    ✅  ciflex-catalog-stack <br>
    ✨  Deployment time: 56.37s 

    Stack ARN: _<arn...>_ <br>
    ✨  Total time: 61.69s 
    
    Catalog repository initialized... 

### **Pipeline Samples**
- [Fork CiFlex Samples Repository](https://github.com/mrwconsulting/CiFlex-Samples)
- Edit pipeline.yaml, replacing "CodeStarArn" attribute value with your own
  
```bash
export AWS_ACCESS_KEY_ID=<AWS_ACCESS_KEY_ID>
export AWS_SECRET_ACCESS_KEY=<AWS_SECRET_ACCESS_KEY>
export CIFLEX_TOKEN=xxxxxxxxxxxxxxxxxxxxxxxxxxxx

cd springboot-maven
../bin/access-token.sh 
export CIFLEX_ACCESS_TOKEN=<CIFLEX_ACCESS_TOKEN>
ciflexctl pipeline --deploy
```

### **List Available Plugins**
```bash
export AWS_ACCESS_KEY_ID=<AWS_ACCESS_KEY_ID>
export AWS_SECRET_ACCESS_KEY=<AWS_SECRET_ACCESS_KEY>

ciflexctl plugins --list
```

### **FAQ**
Q. What are the environment variables used to configure CiFlexctl?<br>
A. Here are a few common ones. See the documentation for more details.<br>
<ol>export CIFLEX_TOKEN="license token"<br>
export CIFLEX_ACCESS_TOKEN="your access token" **"CiFlex access token, created by Cognito"**<br>
export VPC_ID="your vpc id" **"Target AWS VPC for setup"**<br></ol>

Q. Can we add our own stages and steps?<br>
A. Certainly! You can add your own custom stages \ steps to a pipeline by including them in the YAML file that defines the pipeline. This allows you to tailor the pipeline to your specific requirements and workflows.<br>

Q. Can we create our own plugins or update existing ones?<br>
A. Yes, use ciflexctl<br>
<ol>ciflexctl plugins --help</ol>

Q. Can different pipelines be deployed based on a branch in our software development process?<br>
A. Yes, create pipeline properties file. Here's example:[pipeline.properties]<br>
<ol>[branch name]: [pipeline configuration file]<br>
main: pipeline.yaml<br>
dev: pipeline-dev.yaml</ol>

Q. How do I disable a pipeline stage?<br>
A. Both stages and steps can be disabled by setting the 'isActive' attribute to 'false'. Here's an example<br>
<ol>- stageName: DeployStage<br>
&nbsp;&nbsp;pluginName: Manual-Approval<br>
&nbsp;&nbsp;isActive: false **"this disable entire stage"**</ol>

### **Links**
- Platform Setup: [https://youtu.be/qePkAgg8KAQ](https://youtu.be/qePkAgg8KAQ)
- Pipeline Samples: [https://github.com/mrwconsulting/CiFlex-Samples](https://github.com/mrwconsulting/CiFlex-Samples)
- API Docs: [https://github.com/mrwconsulting/CiFlex-Samples/blob/main/docs/README.md](https://github.com/mrwconsulting/CiFlex-Samples/blob/main/docs/README.md)
