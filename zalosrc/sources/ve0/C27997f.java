package ve0;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ve0.f */
/* loaded from: classes4.dex */
public class C27997f implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: p */
    private boolean f130571p;

    /* renamed from: t */
    private boolean f130575t;

    /* renamed from: q */
    private String f130572q = "";

    /* renamed from: r */
    private List f130573r = new ArrayList();

    /* renamed from: s */
    private List f130574s = new ArrayList();

    /* renamed from: u */
    private String f130576u = "";

    /* renamed from: a */
    public String m141098a() {
        return this.f130572q;
    }

    /* renamed from: b */
    public int m141099b(int i11) {
        return ((Integer) this.f130573r.get(i11)).intValue();
    }

    /* renamed from: c */
    public int m141100c() {
        return this.f130573r.size();
    }

    /* renamed from: d */
    public List m141101d() {
        return this.f130573r;
    }

    /* renamed from: e */
    public int m141102e() {
        return this.f130574s.size();
    }

    /* renamed from: f */
    public List m141103f() {
        return this.f130574s;
    }

    /* renamed from: g */
    public C27997f m141104g(String str) {
        this.f130575t = true;
        this.f130576u = str;
        return this;
    }

    /* renamed from: h */
    public C27997f m141105h(String str) {
        this.f130571p = true;
        this.f130572q = str;
        return this;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            m141105h(objectInput.readUTF());
        }
        int readInt = objectInput.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f130573r.add(Integer.valueOf(objectInput.readInt()));
        }
        int readInt2 = objectInput.readInt();
        for (int i12 = 0; i12 < readInt2; i12++) {
            this.f130574s.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            m141104g(objectInput.readUTF());
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.f130571p);
        if (this.f130571p) {
            objectOutput.writeUTF(this.f130572q);
        }
        int m141100c = m141100c();
        objectOutput.writeInt(m141100c);
        for (int i11 = 0; i11 < m141100c; i11++) {
            objectOutput.writeInt(((Integer) this.f130573r.get(i11)).intValue());
        }
        int m141102e = m141102e();
        objectOutput.writeInt(m141102e);
        for (int i12 = 0; i12 < m141102e; i12++) {
            objectOutput.writeInt(((Integer) this.f130574s.get(i12)).intValue());
        }
        objectOutput.writeBoolean(this.f130575t);
        if (this.f130575t) {
            objectOutput.writeUTF(this.f130576u);
        }
    }
}
