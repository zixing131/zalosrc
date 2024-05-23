package com.zing.zalo.imgdecor.model.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import im.C20615f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23265y;
import mt.AbstractC23441a;
import on0.C24329j;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class PaintData extends AbstractC23441a implements Parcelable {
    public static final Parcelable.Creator<PaintData> CREATOR = new C8931a();

    /* renamed from: r */
    public int f47735r;

    /* renamed from: s */
    public int f47736s;

    /* renamed from: t */
    private float f47737t;

    /* renamed from: u */
    public List f47738u;

    /* loaded from: classes4.dex */
    public static final class Position implements Parcelable {
        public static final Parcelable.Creator<Position> CREATOR = new C8930a();

        /* renamed from: p */
        public float f47739p;

        /* renamed from: q */
        public float f47740q;

        /* renamed from: r */
        public float f47741r;

        /* renamed from: com.zing.zalo.imgdecor.model.model.PaintData$Position$a */
        /* loaded from: classes4.dex */
        public static final class C8930a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Position createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                return new Position(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Position[] newArray(int i11) {
                return new Position[i11];
            }
        }

        public Position() {
            this(0.0f, 0.0f, 0.0f, 7, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            parcel.writeFloat(this.f47739p);
            parcel.writeFloat(this.f47740q);
            parcel.writeFloat(this.f47741r);
        }

        public Position(float f11, float f12, float f13) {
            this.f47739p = f11;
            this.f47740q = f12;
            this.f47741r = f13;
        }

        public /* synthetic */ Position(float f11, float f12, float f13, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) != 0 ? 0.0f : f12, (i11 & 4) != 0 ? 0.0f : f13);
        }
    }

    /* renamed from: com.zing.zalo.imgdecor.model.model.PaintData$a */
    /* loaded from: classes4.dex */
    public static final class C8931a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaintData createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            float readFloat = parcel.readFloat();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i11 = 0; i11 != readInt3; i11++) {
                arrayList.add(Position.CREATOR.createFromParcel(parcel));
            }
            return new PaintData(readInt, readInt2, readFloat, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaintData[] newArray(int i11) {
            return new PaintData[i11];
        }
    }

    public PaintData() {
        this(0, 0, 0.0f, null, 15, null);
    }

    @Override // mt.AbstractC23441a
    /* renamed from: a */
    public void mo47634a(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        this.f47735r = jSONObject.optInt("ty");
        this.f47736s = jSONObject.optInt("co");
        mo47637g((float) jSONObject.optDouble("si"));
        mo47623e(jSONObject);
    }

    @Override // mt.AbstractC23441a
    /* renamed from: b */
    public C20615f mo47635b() {
        String m120017d;
        if (this.f47735r == 3) {
            m120017d = "";
        } else {
            m120017d = AbstractC23265y.m120017d(this.f47736s);
            AbstractC19074t.m100207e(m120017d, "convertIntToHexaColor(...)");
        }
        return new C20615f(m120017d, (int) mo47636c(), this.f47735r);
    }

    @Override // mt.AbstractC23441a
    /* renamed from: c */
    public float mo47636c() {
        return this.f47737t;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mt.AbstractC23441a
    /* renamed from: e */
    public void mo47623e(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        String optString = jSONObject.optString("xs");
        String optString2 = jSONObject.optString("ys");
        String optString3 = jSONObject.optString("ss");
        if (optString != null && optString.length() != 0 && optString2 != null && optString2.length() != 0) {
            AbstractC19074t.m100205c(optString);
            List m127021i = new C24329j(" ").m127021i(optString, 0);
            AbstractC19074t.m100205c(optString2);
            List m127021i2 = new C24329j(" ").m127021i(optString2, 0);
            AbstractC19074t.m100205c(optString3);
            List m127021i3 = new C24329j(" ").m127021i(optString3, 0);
            if (m127021i.size() == m127021i2.size() && m127021i2.size() == m127021i3.size()) {
                this.f47738u.clear();
                int size = m127021i.size();
                for (int i11 = 0; i11 < size; i11++) {
                    this.f47738u.add(new Position(Float.parseFloat((String) m127021i.get(i11)), Float.parseFloat((String) m127021i2.get(i11)), Float.parseFloat((String) m127021i3.get(i11))));
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaintData)) {
            return false;
        }
        PaintData paintData = (PaintData) obj;
        return this.f47735r == paintData.f47735r && this.f47736s == paintData.f47736s && Float.compare(this.f47737t, paintData.f47737t) == 0 && AbstractC19074t.m100204b(this.f47738u, paintData.f47738u);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mt.AbstractC23441a
    /* renamed from: f */
    public void mo47624f(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        if (this.f47738u.size() > 0) {
            Position position = (Position) this.f47738u.get(0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(position.f47739p);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(position.f47740q);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(position.f47741r);
            int size = this.f47738u.size();
            for (int i11 = 1; i11 < size; i11++) {
                Position position2 = (Position) this.f47738u.get(i11);
                sb2.append(" ");
                sb2.append(position2.f47739p);
                sb3.append(" ");
                sb3.append(position2.f47740q);
                sb4.append(" ");
                sb4.append(position2.f47741r);
            }
            jSONObject.put("xs", sb2.toString());
            jSONObject.put("ys", sb3.toString());
            jSONObject.put("ss", sb4.toString());
        }
    }

    @Override // mt.AbstractC23441a
    /* renamed from: g */
    public void mo47637g(float f11) {
        this.f47737t = f11;
    }

    @Override // mt.AbstractC23441a
    /* renamed from: h */
    public JSONObject mo47638h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ty", this.f47735r);
            jSONObject.put("co", this.f47736s);
            jSONObject.put("si", Float.valueOf(mo47636c()));
            mo47624f(jSONObject);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public int hashCode() {
        return (((((this.f47735r * 31) + this.f47736s) * 31) + Float.floatToIntBits(this.f47737t)) * 31) + this.f47738u.hashCode();
    }

    /* renamed from: i */
    public final void m47639i(Position position) {
        AbstractC19074t.m100208f(position, "pos");
        this.f47738u.add(position);
    }

    public String toString() {
        return "PaintData(type=" + this.f47735r + ", color=" + this.f47736s + ", size=" + this.f47737t + ", positions=" + this.f47738u + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f47735r);
        parcel.writeInt(this.f47736s);
        parcel.writeFloat(this.f47737t);
        List list = this.f47738u;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Position) it.next()).writeToParcel(parcel, i11);
        }
    }

    public PaintData(int i11, int i12, float f11) {
        this(i11, i12, f11, null, 8, null);
    }

    public /* synthetic */ PaintData(int i11, int i12, float f11, List list, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? 0.0f : f11, (i13 & 8) != 0 ? new ArrayList() : list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaintData(int i11, int i12, float f11, List list) {
        super(0);
        AbstractC19074t.m100208f(list, "positions");
        this.f47735r = i11;
        this.f47736s = i12;
        this.f47737t = f11;
        this.f47738u = list;
    }
}
