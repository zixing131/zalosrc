package rm0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import qm0.AbstractC25366r;
import qm0.AbstractC25377w0;

/* renamed from: rm0.h */
/* loaded from: classes7.dex */
public final class C25842h implements Externalizable {

    /* renamed from: r */
    public static final a f123258r = new a(null);
    private static final long serialVersionUID = 0;

    /* renamed from: p */
    private Collection f123259p;

    /* renamed from: q */
    private final int f123260q;

    /* renamed from: rm0.h$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C25842h(Collection collection, int i11) {
        AbstractC19074t.m100208f(collection, "collection");
        this.f123259p = collection;
        this.f123260q = i11;
    }

    private final Object readResolve() {
        return this.f123259p;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        List m131495d;
        List m131492a;
        List list;
        Set m131537c;
        Set m131535a;
        AbstractC19074t.m100208f(objectInput, "input");
        byte readByte = objectInput.readByte();
        int i11 = readByte & 1;
        if ((readByte & (-2)) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i12 = 0;
                if (i11 == 0) {
                    m131495d = AbstractC25366r.m131495d(readInt);
                    while (i12 < readInt) {
                        m131495d.add(objectInput.readObject());
                        i12++;
                    }
                    m131492a = AbstractC25366r.m131492a(m131495d);
                    list = m131492a;
                } else if (i11 == 1) {
                    m131537c = AbstractC25377w0.m131537c(readInt);
                    while (i12 < readInt) {
                        m131537c.add(objectInput.readObject());
                        i12++;
                    }
                    m131535a = AbstractC25377w0.m131535a(m131537c);
                    list = m131535a;
                } else {
                    throw new InvalidObjectException("Unsupported collection type tag: " + i11 + '.');
                }
                this.f123259p = list;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        AbstractC19074t.m100208f(objectOutput, "output");
        objectOutput.writeByte(this.f123260q);
        objectOutput.writeInt(this.f123259p.size());
        Iterator it = this.f123259p.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }
}
