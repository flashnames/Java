package Structure.Interface;

import Structure.Node.Node;

public interface ICyclelist<T> {
    public void Initial(T var);
    public void Delete(int index);
    public void Insert(T var);
    public void Show(Node<T> node);
}
