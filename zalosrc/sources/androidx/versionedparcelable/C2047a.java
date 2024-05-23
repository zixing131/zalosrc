package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import p665y0.C30239a;

/* renamed from: androidx.versionedparcelable.a */
/* loaded from: classes2.dex */
class C2047a extends VersionedParcel {

    /* renamed from: d */
    private final SparseIntArray f8741d;

    /* renamed from: e */
    private final Parcel f8742e;

    /* renamed from: f */
    private final int f8743f;

    /* renamed from: g */
    private final int f8744g;

    /* renamed from: h */
    private final String f8745h;

    /* renamed from: i */
    private int f8746i;

    /* renamed from: j */
    private int f8747j;

    /* renamed from: k */
    private int f8748k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2047a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C30239a(), new C30239a(), new C30239a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: A */
    public void mo11118A(byte[] bArr) {
        if (bArr != null) {
            this.f8742e.writeInt(bArr.length);
            this.f8742e.writeByteArray(bArr);
        } else {
            this.f8742e.writeInt(-1);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: C */
    protected void mo11120C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f8742e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: E */
    public void mo11122E(int i11) {
        this.f8742e.writeInt(i11);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: G */
    public void mo11124G(Parcelable parcelable) {
        this.f8742e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: I */
    public void mo11126I(String str) {
        this.f8742e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: a */
    public void mo11131a() {
        int i11 = this.f8746i;
        if (i11 >= 0) {
            int i12 = this.f8741d.get(i11);
            int dataPosition = this.f8742e.dataPosition();
            this.f8742e.setDataPosition(i12);
            this.f8742e.writeInt(dataPosition - i12);
            this.f8742e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: b */
    protected VersionedParcel mo11132b() {
        Parcel parcel = this.f8742e;
        int dataPosition = parcel.dataPosition();
        int i11 = this.f8747j;
        if (i11 == this.f8743f) {
            i11 = this.f8744g;
        }
        return new C2047a(parcel, dataPosition, i11, this.f8745h + "  ", this.f8738a, this.f8739b, this.f8740c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: g */
    public boolean mo11134g() {
        if (this.f8742e.readInt() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: i */
    public byte[] mo11136i() {
        int readInt = this.f8742e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f8742e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: k */
    protected CharSequence mo11138k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f8742e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: m */
    public boolean mo11140m(int i11) {
        while (this.f8747j < this.f8744g) {
            int i12 = this.f8748k;
            if (i12 == i11) {
                return true;
            }
            if (String.valueOf(i12).compareTo(String.valueOf(i11)) > 0) {
                return false;
            }
            this.f8742e.setDataPosition(this.f8747j);
            int readInt = this.f8742e.readInt();
            this.f8748k = this.f8742e.readInt();
            this.f8747j += readInt;
        }
        if (this.f8748k != i11) {
            return false;
        }
        return true;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: o */
    public int mo11142o() {
        return this.f8742e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: q */
    public Parcelable mo11144q() {
        return this.f8742e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: s */
    public String mo11146s() {
        return this.f8742e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: w */
    public void mo11150w(int i11) {
        mo11131a();
        this.f8746i = i11;
        this.f8741d.put(i11, this.f8742e.dataPosition());
        mo11122E(0);
        mo11122E(i11);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: y */
    public void mo11152y(boolean z11) {
        this.f8742e.writeInt(z11 ? 1 : 0);
    }

    private C2047a(Parcel parcel, int i11, int i12, String str, C30239a c30239a, C30239a c30239a2, C30239a c30239a3) {
        super(c30239a, c30239a2, c30239a3);
        this.f8741d = new SparseIntArray();
        this.f8746i = -1;
        this.f8748k = -1;
        this.f8742e = parcel;
        this.f8743f = i11;
        this.f8744g = i12;
        this.f8747j = i11;
        this.f8745h = str;
    }
}
