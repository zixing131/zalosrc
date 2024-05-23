package ve0;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ve0.e */
/* loaded from: classes4.dex */
public class C27996e implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: p */
    private List f130570p = new ArrayList();

    /* renamed from: a */
    public int m141096a() {
        return this.f130570p.size();
    }

    /* renamed from: b */
    public List m141097b() {
        return this.f130570p;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            C27995d c27995d = new C27995d();
            c27995d.readExternal(objectInput);
            this.f130570p.add(c27995d);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        int m141096a = m141096a();
        objectOutput.writeInt(m141096a);
        for (int i11 = 0; i11 < m141096a; i11++) {
            ((C27995d) this.f130570p.get(i11)).writeExternal(objectOutput);
        }
    }
}
