package com.zing.zalo.camera.common.models;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.camera.common.models.inputparams.SendInputParams;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import ho0.AbstractC20110a;
import p545ue.C27239a;
import p559uv.C27373c;

/* loaded from: classes3.dex */
public class CameraInputParams implements Parcelable {
    public static final Parcelable.Creator<CameraInputParams> CREATOR = new C7582a();

    /* renamed from: A */
    public C27373c f41082A;

    /* renamed from: B */
    public String f41083B;

    /* renamed from: C */
    public boolean f41084C;

    /* renamed from: D */
    public boolean f41085D;

    /* renamed from: E */
    public boolean f41086E;

    /* renamed from: F */
    public boolean f41087F;

    /* renamed from: G */
    public boolean f41088G;

    /* renamed from: H */
    public boolean f41089H;

    /* renamed from: I */
    public boolean f41090I;

    /* renamed from: J */
    public boolean f41091J;

    /* renamed from: K */
    public boolean f41092K;

    /* renamed from: L */
    public boolean f41093L;

    /* renamed from: M */
    public int f41094M;

    /* renamed from: N */
    public boolean f41095N;

    /* renamed from: O */
    public boolean f41096O;

    /* renamed from: P */
    public boolean f41097P;

    /* renamed from: Q */
    public int f41098Q;

    /* renamed from: R */
    public int f41099R;

    /* renamed from: S */
    public boolean f41100S;

    /* renamed from: T */
    public boolean f41101T;

    /* renamed from: U */
    public boolean f41102U;

    /* renamed from: V */
    public boolean f41103V;

    /* renamed from: W */
    public boolean f41104W;

    /* renamed from: X */
    public String f41105X;

    /* renamed from: Y */
    public int f41106Y;

    /* renamed from: Z */
    public int f41107Z;

    /* renamed from: a0 */
    public boolean f41108a0;

    /* renamed from: b0 */
    public int f41109b0;

    /* renamed from: c0 */
    public long f41110c0;

    /* renamed from: d0 */
    public String f41111d0;

    /* renamed from: e0 */
    public int f41112e0;

    /* renamed from: f0 */
    public double f41113f0;

    /* renamed from: g0 */
    public double f41114g0;

    /* renamed from: h0 */
    public double f41115h0;

    /* renamed from: i0 */
    public double f41116i0;

    /* renamed from: j0 */
    public boolean f41117j0;

    /* renamed from: k0 */
    private Point f41118k0;

    /* renamed from: l0 */
    public SendInputParams f41119l0;

    /* renamed from: m0 */
    public C27239a f41120m0;

    /* renamed from: n0 */
    public boolean f41121n0;

    /* renamed from: o0 */
    public String f41122o0;

    /* renamed from: p */
    public int f41123p;

    /* renamed from: p0 */
    public String f41124p0;

    /* renamed from: q */
    public int f41125q;

    /* renamed from: q0 */
    public boolean f41126q0;

    /* renamed from: r */
    private float f41127r;

    /* renamed from: r0 */
    public String f41128r0;

    /* renamed from: s */
    public int f41129s;

    /* renamed from: s0 */
    public String f41130s0;

    /* renamed from: t */
    public int f41131t;

    /* renamed from: t0 */
    public long f41132t0;

    /* renamed from: u */
    public int f41133u;

    /* renamed from: u0 */
    public int f41134u0;

    /* renamed from: v */
    public int f41135v;

    /* renamed from: v0 */
    public String f41136v0;

    /* renamed from: w */
    public String f41137w;

    /* renamed from: w0 */
    public SensitiveData f41138w0;

    /* renamed from: x */
    public String f41139x;

    /* renamed from: x0 */
    public boolean f41140x0;

    /* renamed from: y */
    public String f41141y;

    /* renamed from: z */
    public String f41142z;

    /* renamed from: com.zing.zalo.camera.common.models.CameraInputParams$a */
    /* loaded from: classes3.dex */
    class C7582a implements Parcelable.Creator {
        C7582a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CameraInputParams createFromParcel(Parcel parcel) {
            return new CameraInputParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CameraInputParams[] newArray(int i11) {
            return new CameraInputParams[i11];
        }
    }

    public CameraInputParams() {
        this.f41123p = 0;
        this.f41125q = 0;
        this.f41127r = 1.0f;
        this.f41129s = 0;
        this.f41131t = -1;
        this.f41133u = 0;
        this.f41135v = 0;
        this.f41084C = false;
        this.f41085D = false;
        this.f41086E = false;
        this.f41087F = false;
        this.f41088G = false;
        this.f41089H = false;
        this.f41090I = false;
        this.f41091J = false;
        this.f41092K = false;
        this.f41093L = false;
        this.f41094M = 0;
        this.f41095N = false;
        this.f41096O = false;
        this.f41097P = false;
        this.f41098Q = 0;
        this.f41099R = 0;
        this.f41100S = false;
        this.f41101T = false;
        this.f41102U = false;
        this.f41103V = false;
        this.f41104W = false;
        this.f41105X = "7";
        this.f41106Y = -1;
        this.f41107Z = 2;
        this.f41108a0 = true;
        this.f41110c0 = 0L;
        this.f41111d0 = "";
        this.f41112e0 = -1;
        this.f41113f0 = 0.0d;
        this.f41114g0 = 0.0d;
        this.f41115h0 = 0.0d;
        this.f41116i0 = 0.0d;
        this.f41117j0 = false;
        this.f41118k0 = null;
        this.f41119l0 = null;
        this.f41120m0 = null;
        this.f41121n0 = false;
        this.f41122o0 = "";
        this.f41124p0 = "";
        this.f41126q0 = false;
        this.f41128r0 = "";
        this.f41130s0 = "0";
        this.f41132t0 = 0L;
        this.f41134u0 = -1;
        this.f41136v0 = "";
        this.f41140x0 = false;
    }

    /* renamed from: e */
    public static CameraInputParams m39195e() {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 0;
        cameraInputParams.f41103V = true;
        cameraInputParams.f41095N = true;
        cameraInputParams.f41119l0 = new SendInputParams(2);
        return cameraInputParams;
    }

    /* renamed from: f */
    public static CameraInputParams m39196f() {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 0;
        cameraInputParams.f41104W = true;
        cameraInputParams.f41095N = true;
        cameraInputParams.f41107Z = 5;
        cameraInputParams.f41119l0 = new SendInputParams(2);
        return cameraInputParams;
    }

    /* renamed from: g */
    public static CameraInputParams m39197g(String str, String str2, String str3) {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 4;
        cameraInputParams.f41137w = str;
        cameraInputParams.f41141y = str2;
        cameraInputParams.f41096O = true;
        if (!TextUtils.isEmpty(str3)) {
            try {
                String[] split = str3.split(":");
                if (split.length == 2) {
                    cameraInputParams.f41098Q = Integer.parseInt(split[0]);
                    cameraInputParams.f41099R = Integer.parseInt(split[1]);
                    cameraInputParams.f41097P = true;
                }
            } catch (NumberFormatException e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        cameraInputParams.f41119l0 = new SendInputParams(2);
        return cameraInputParams;
    }

    /* renamed from: h */
    public static CameraInputParams m39198h(String str) {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 4;
        cameraInputParams.f41137w = str;
        cameraInputParams.f41089H = true;
        return cameraInputParams;
    }

    /* renamed from: i */
    public static CameraInputParams m39199i(String str) {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 4;
        cameraInputParams.f41137w = str;
        cameraInputParams.f41141y = str;
        cameraInputParams.f41095N = true;
        cameraInputParams.f41119l0 = new SendInputParams(1);
        cameraInputParams.f41105X = "2";
        return cameraInputParams;
    }

    /* renamed from: j */
    public static CameraInputParams m39200j() {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 0;
        cameraInputParams.f41133u = 0;
        cameraInputParams.f41086E = true;
        cameraInputParams.f41105X = "1";
        return cameraInputParams;
    }

    /* renamed from: k */
    public static CameraInputParams m39201k(boolean z11) {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 1;
        cameraInputParams.f41105X = "1";
        cameraInputParams.f41121n0 = z11;
        return cameraInputParams;
    }

    /* renamed from: l */
    public static CameraInputParams m39202l(String str) {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 4;
        cameraInputParams.f41137w = str;
        cameraInputParams.f41086E = true;
        cameraInputParams.f41105X = "2";
        return cameraInputParams;
    }

    /* renamed from: m */
    public static CameraInputParams m39203m() {
        return new CameraInputParams();
    }

    /* renamed from: n */
    public static CameraInputParams m39204n(C27373c c27373c) {
        String str;
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 5;
        cameraInputParams.f41133u = 2;
        cameraInputParams.f41105X = "6";
        cameraInputParams.f41119l0 = new SendInputParams(2);
        cameraInputParams.f41108a0 = false;
        cameraInputParams.f41139x = c27373c.m140220E();
        cameraInputParams.f41141y = c27373c.m140268v();
        VideoBlendingParam videoBlendingParam = c27373c.f128947T;
        if (videoBlendingParam != null) {
            str = videoBlendingParam.f48280t;
        } else {
            str = "";
        }
        cameraInputParams.f41083B = str;
        cameraInputParams.f41082A = c27373c;
        cameraInputParams.f41093L = true;
        return cameraInputParams;
    }

    /* renamed from: o */
    public static CameraInputParams m39205o() {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 7;
        cameraInputParams.f41133u = 3;
        cameraInputParams.f41093L = true;
        cameraInputParams.f41105X = "4";
        return cameraInputParams;
    }

    /* renamed from: p */
    public static CameraInputParams m39206p(String str) {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 7;
        cameraInputParams.f41133u = 3;
        cameraInputParams.f41137w = str;
        cameraInputParams.f41141y = str;
        return cameraInputParams;
    }

    /* renamed from: q */
    public static CameraInputParams m39207q(String str) {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 7;
        cameraInputParams.f41133u = 3;
        cameraInputParams.f41139x = str;
        return cameraInputParams;
    }

    /* renamed from: t */
    public static CameraInputParams m39208t(C27373c c27373c) {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 5;
        cameraInputParams.f41105X = "2";
        cameraInputParams.f41119l0 = new SendInputParams(1);
        cameraInputParams.f41108a0 = false;
        cameraInputParams.f41139x = c27373c.m140220E();
        cameraInputParams.f41141y = c27373c.m140268v();
        cameraInputParams.f41082A = c27373c;
        cameraInputParams.f41093L = true;
        cameraInputParams.f41094M = 1;
        return cameraInputParams;
    }

    /* renamed from: u */
    public static CameraInputParams m39209u(String str) {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 0;
        cameraInputParams.f41133u = 2;
        cameraInputParams.f41084C = true;
        cameraInputParams.f41105X = "6";
        cameraInputParams.f41137w = str;
        return cameraInputParams;
    }

    /* renamed from: w */
    public static CameraInputParams m39210w() {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 0;
        cameraInputParams.f41133u = 2;
        cameraInputParams.f41084C = true;
        cameraInputParams.f41105X = "6";
        return cameraInputParams;
    }

    /* renamed from: x */
    public static CameraInputParams m39211x(String str, String str2) {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 4;
        cameraInputParams.f41137w = str;
        cameraInputParams.f41141y = str2;
        cameraInputParams.f41142z = str2;
        cameraInputParams.f41133u = 2;
        cameraInputParams.f41105X = "6";
        return cameraInputParams;
    }

    /* renamed from: a */
    public boolean m39212a() {
        return (this.f41084C || this.f41088G || this.f41087F || this.f41086E) ? false : true;
    }

    /* renamed from: b */
    public boolean m39213b() {
        return this.f41084C || this.f41089H || this.f41088G || this.f41086E || this.f41097P;
    }

    /* renamed from: c */
    public Point m39214c() {
        return this.f41118k0;
    }

    /* renamed from: d */
    public boolean m39215d() {
        if (TextUtils.isEmpty(this.f41137w) && TextUtils.isEmpty(this.f41139x)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f41123p);
        parcel.writeInt(this.f41125q);
        parcel.writeFloat(this.f41127r);
        parcel.writeInt(this.f41129s);
        parcel.writeInt(this.f41131t);
        parcel.writeInt(this.f41133u);
        parcel.writeInt(this.f41135v);
        parcel.writeString(this.f41137w);
        parcel.writeString(this.f41139x);
        parcel.writeString(this.f41141y);
        parcel.writeString(this.f41142z);
        parcel.writeSerializable(this.f41082A);
        parcel.writeInt(this.f41084C ? 1 : 0);
        parcel.writeInt(this.f41085D ? 1 : 0);
        parcel.writeInt(this.f41086E ? 1 : 0);
        parcel.writeInt(this.f41087F ? 1 : 0);
        parcel.writeInt(this.f41088G ? 1 : 0);
        parcel.writeInt(this.f41089H ? 1 : 0);
        parcel.writeInt(this.f41096O ? 1 : 0);
        parcel.writeInt(this.f41097P ? 1 : 0);
        parcel.writeInt(this.f41098Q);
        parcel.writeInt(this.f41099R);
        parcel.writeInt(this.f41100S ? 1 : 0);
        parcel.writeInt(this.f41101T ? 1 : 0);
        parcel.writeInt(this.f41102U ? 1 : 0);
        parcel.writeInt(this.f41103V ? 1 : 0);
        parcel.writeInt(this.f41104W ? 1 : 0);
        parcel.writeInt(this.f41090I ? 1 : 0);
        parcel.writeInt(this.f41091J ? 1 : 0);
        parcel.writeInt(this.f41092K ? 1 : 0);
        parcel.writeString(this.f41105X);
        parcel.writeParcelable(this.f41119l0, i11);
        parcel.writeInt(this.f41108a0 ? 1 : 0);
        parcel.writeString(this.f41083B);
        parcel.writeInt(this.f41093L ? 1 : 0);
        parcel.writeInt(this.f41109b0);
        parcel.writeInt(this.f41094M);
        parcel.writeInt(this.f41095N ? 1 : 0);
        parcel.writeInt(this.f41107Z);
        parcel.writeParcelable(this.f41118k0, i11);
        parcel.writeInt(this.f41121n0 ? 1 : 0);
        parcel.writeParcelable(this.f41138w0, i11);
        parcel.writeLong(this.f41110c0);
        parcel.writeString(this.f41111d0);
        parcel.writeInt(this.f41112e0);
        parcel.writeDouble(this.f41113f0);
        parcel.writeDouble(this.f41114g0);
        parcel.writeDouble(this.f41115h0);
        parcel.writeDouble(this.f41116i0);
        parcel.writeInt(this.f41117j0 ? 1 : 0);
    }

    /* renamed from: y */
    public void m39216y(Point point) {
        this.f41118k0 = point;
    }

    CameraInputParams(Parcel parcel) {
        this.f41123p = 0;
        this.f41125q = 0;
        this.f41127r = 1.0f;
        this.f41129s = 0;
        this.f41131t = -1;
        this.f41133u = 0;
        this.f41135v = 0;
        this.f41084C = false;
        this.f41085D = false;
        this.f41086E = false;
        this.f41087F = false;
        this.f41088G = false;
        this.f41089H = false;
        this.f41090I = false;
        this.f41091J = false;
        this.f41092K = false;
        this.f41093L = false;
        this.f41094M = 0;
        this.f41095N = false;
        this.f41096O = false;
        this.f41097P = false;
        this.f41098Q = 0;
        this.f41099R = 0;
        this.f41100S = false;
        this.f41101T = false;
        this.f41102U = false;
        this.f41103V = false;
        this.f41104W = false;
        this.f41105X = "7";
        this.f41106Y = -1;
        this.f41107Z = 2;
        this.f41108a0 = true;
        this.f41110c0 = 0L;
        this.f41111d0 = "";
        this.f41112e0 = -1;
        this.f41113f0 = 0.0d;
        this.f41114g0 = 0.0d;
        this.f41115h0 = 0.0d;
        this.f41116i0 = 0.0d;
        this.f41117j0 = false;
        this.f41118k0 = null;
        this.f41119l0 = null;
        this.f41120m0 = null;
        this.f41121n0 = false;
        this.f41122o0 = "";
        this.f41124p0 = "";
        this.f41126q0 = false;
        this.f41128r0 = "";
        this.f41130s0 = "0";
        this.f41132t0 = 0L;
        this.f41134u0 = -1;
        this.f41136v0 = "";
        this.f41140x0 = false;
        this.f41123p = parcel.readInt();
        this.f41125q = parcel.readInt();
        this.f41127r = parcel.readFloat();
        this.f41129s = parcel.readInt();
        this.f41131t = parcel.readInt();
        this.f41133u = parcel.readInt();
        this.f41135v = parcel.readInt();
        this.f41137w = parcel.readString();
        this.f41139x = parcel.readString();
        this.f41141y = parcel.readString();
        this.f41142z = parcel.readString();
        this.f41082A = (C27373c) parcel.readSerializable();
        this.f41084C = parcel.readInt() == 1;
        this.f41085D = parcel.readInt() == 1;
        this.f41086E = parcel.readInt() == 1;
        this.f41087F = parcel.readInt() == 1;
        this.f41088G = parcel.readInt() == 1;
        this.f41089H = parcel.readInt() == 1;
        this.f41096O = parcel.readInt() == 1;
        this.f41097P = parcel.readInt() == 1;
        this.f41098Q = parcel.readInt();
        this.f41099R = parcel.readInt();
        this.f41100S = parcel.readInt() == 1;
        this.f41101T = parcel.readInt() == 1;
        this.f41102U = parcel.readInt() == 1;
        this.f41103V = parcel.readInt() == 1;
        this.f41104W = parcel.readInt() == 1;
        this.f41090I = parcel.readInt() == 1;
        this.f41091J = parcel.readInt() == 1;
        this.f41092K = parcel.readInt() == 1;
        this.f41105X = parcel.readString();
        this.f41119l0 = (SendInputParams) parcel.readParcelable(SendInputParams.class.getClassLoader());
        this.f41108a0 = parcel.readInt() == 1;
        this.f41083B = parcel.readString();
        this.f41093L = parcel.readInt() == 1;
        this.f41109b0 = parcel.readInt();
        this.f41094M = parcel.readInt();
        this.f41095N = parcel.readInt() == 1;
        this.f41107Z = parcel.readInt();
        this.f41118k0 = (Point) parcel.readParcelable(Point.class.getClassLoader());
        this.f41121n0 = parcel.readInt() == 1;
        this.f41138w0 = (SensitiveData) parcel.readParcelable(SensitiveData.class.getClassLoader());
        this.f41110c0 = parcel.readLong();
        this.f41111d0 = parcel.readString();
        this.f41112e0 = parcel.readInt();
        this.f41113f0 = parcel.readDouble();
        this.f41114g0 = parcel.readDouble();
        this.f41115h0 = parcel.readDouble();
        this.f41116i0 = parcel.readDouble();
        this.f41117j0 = parcel.readInt() == 1;
    }
}
