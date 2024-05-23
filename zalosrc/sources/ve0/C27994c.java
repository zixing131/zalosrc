package ve0;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ve0.c */
/* loaded from: classes4.dex */
public class C27994c implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: p */
    private boolean f130497p;

    /* renamed from: r */
    private boolean f130499r;

    /* renamed from: u */
    private boolean f130502u;

    /* renamed from: w */
    private boolean f130504w;

    /* renamed from: y */
    private boolean f130506y;

    /* renamed from: q */
    private String f130498q = "";

    /* renamed from: s */
    private String f130500s = "";

    /* renamed from: t */
    private List f130501t = new ArrayList();

    /* renamed from: v */
    private String f130503v = "";

    /* renamed from: x */
    private boolean f130505x = false;

    /* renamed from: z */
    private String f130507z = "";

    /* renamed from: a */
    public String m141028a() {
        return this.f130507z;
    }

    /* renamed from: b */
    public String m141029b(int i11) {
        return (String) this.f130501t.get(i11);
    }

    /* renamed from: c */
    public int m141030c() {
        return this.f130501t.size();
    }

    /* renamed from: d */
    public String m141031d() {
        return this.f130503v;
    }

    /* renamed from: e */
    public String m141032e() {
        return this.f130498q;
    }

    /* renamed from: f */
    public int m141033f() {
        return m141030c();
    }

    /* renamed from: g */
    public C27994c m141034g(String str) {
        this.f130506y = true;
        this.f130507z = str;
        return this;
    }

    public String getFormat() {
        return this.f130500s;
    }

    /* renamed from: h */
    public C27994c m141035h(String str) {
        this.f130499r = true;
        this.f130500s = str;
        return this;
    }

    /* renamed from: i */
    public C27994c m141036i(String str) {
        this.f130502u = true;
        this.f130503v = str;
        return this;
    }

    /* renamed from: j */
    public C27994c m141037j(boolean z11) {
        this.f130504w = true;
        this.f130505x = z11;
        return this;
    }

    /* renamed from: k */
    public C27994c m141038k(String str) {
        this.f130497p = true;
        this.f130498q = str;
        return this;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        m141038k(objectInput.readUTF());
        m141035h(objectInput.readUTF());
        int readInt = objectInput.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f130501t.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            m141036i(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            m141034g(objectInput.readUTF());
        }
        m141037j(objectInput.readBoolean());
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f130498q);
        objectOutput.writeUTF(this.f130500s);
        int m141033f = m141033f();
        objectOutput.writeInt(m141033f);
        for (int i11 = 0; i11 < m141033f; i11++) {
            objectOutput.writeUTF((String) this.f130501t.get(i11));
        }
        objectOutput.writeBoolean(this.f130502u);
        if (this.f130502u) {
            objectOutput.writeUTF(this.f130503v);
        }
        objectOutput.writeBoolean(this.f130506y);
        if (this.f130506y) {
            objectOutput.writeUTF(this.f130507z);
        }
        objectOutput.writeBoolean(this.f130505x);
    }
}
