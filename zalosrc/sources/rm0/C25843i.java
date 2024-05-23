package rm0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import qm0.AbstractC25361o0;

/* renamed from: rm0.i */
/* loaded from: classes7.dex */
final class C25843i implements Externalizable {

    /* renamed from: q */
    public static final a f123261q = new a(null);
    private static final long serialVersionUID = 0;

    /* renamed from: p */
    private Map f123262p;

    /* renamed from: rm0.i$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C25843i(Map map) {
        AbstractC19074t.m100208f(map, "map");
        this.f123262p = map;
    }

    private final Object readResolve() {
        return this.f123262p;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        Map m131399d;
        Map m131397b;
        AbstractC19074t.m100208f(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                m131399d = AbstractC25361o0.m131399d(readInt);
                for (int i11 = 0; i11 < readInt; i11++) {
                    m131399d.put(objectInput.readObject(), objectInput.readObject());
                }
                m131397b = AbstractC25361o0.m131397b(m131399d);
                this.f123262p = m131397b;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte));
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        AbstractC19074t.m100208f(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f123262p.size());
        for (Map.Entry entry : this.f123262p.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
