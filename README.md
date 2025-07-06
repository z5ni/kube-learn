## kubectl Commands

### Resource Inspection
#### List all key resources
```
kubectl get all
```
- View Pods, Services, Deployments etc. at once

#### List specific resources
```
kubectl get pods
kubectl get svc
kubectl get deploy
```
- List Pods, Services, and Deployments respectively

#### View full YAML definition
```
kubectl get pod <name> -o yaml
```
- Output the complete resource definition

---

### Detailed Status & Events
#### Check detailed Pod status
```
kubectl describe pod <name>
```
- View events, status, and scheduling issues

#### Check Deployment status
```
kubectl describe deploy <name>
```
- See rollout progress, replica status, and strategies

#### View events sorted by time
```
kubectl get events --sort-by=.metadata.creationTimestamp
```
- Useful for debugging by chronological order

---

### Debugging
#### View logs
```
kubectl logs <pod-name>
```
- Check container stdout/stderr logs

#### View previous logs (crashed pod)
```
kubectl logs <pod-name> --previous
```
- See logs from the last terminated container

#### Access container shell
```
kubectl exec -it <pod-name> -- bash/sh
```
- Inspect environment, files, or processes inside the container

---

### Deployment & Management
#### Apply resources
```
kubectl apply -f <file>.yaml
```
- Create or update resources from a YAML file

#### Delete resources
```
kubectl delete -f <file>.yaml
kubectl delete pod <name>
```
- Manually delete a resource or Pod

#### Watch live Pod status
```
kubectl get pods -w
```
- Stream Pod state changes in real time

#### Rollback a Deployment
```
kubectl rollout undo deploy <name>
```
- Revert to the previous Deployment revision

---

### Network / Acess
#### Port forwarding
```
kubectl port-forward pod/<name> 8080:80
```
- Forward local port 8080 to container port 80

#### Check service endpoints
```
kubectl get svc
```
- View ClusterIP, NodePort, or LoadBalancer addresses
