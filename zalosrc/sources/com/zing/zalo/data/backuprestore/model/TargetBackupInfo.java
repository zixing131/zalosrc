package com.zing.zalo.data.backuprestore.model;

import am.AbstractC0924m0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.net.URLDecoder;
import me0.AbstractC23244v8;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import sc.C26220b;

/* loaded from: classes3.dex */
public final class TargetBackupInfo implements Parcelable {

    /* renamed from: A */
    private long f42856A;

    /* renamed from: B */
    private long f42857B;

    /* renamed from: C */
    private long f42858C;

    /* renamed from: D */
    private final int f42859D;

    /* renamed from: E */
    private final String f42860E;

    /* renamed from: F */
    private final JSONObject f42861F;

    /* renamed from: G */
    private final int f42862G;

    /* renamed from: H */
    private int f42863H;

    /* renamed from: I */
    private final String f42864I;

    /* renamed from: J */
    private final long f42865J;

    /* renamed from: K */
    private final String f42866K;

    /* renamed from: L */
    private final int f42867L;

    /* renamed from: M */
    private final int f42868M;

    /* renamed from: N */
    private String f42869N;

    /* renamed from: p */
    private int f42870p;

    /* renamed from: q */
    private final String f42871q;

    /* renamed from: r */
    private final String f42872r;

    /* renamed from: s */
    private final String f42873s;

    /* renamed from: t */
    private final String f42874t;

    /* renamed from: u */
    private final long f42875u;

    /* renamed from: v */
    private final long f42876v;

    /* renamed from: w */
    private final long f42877w;

    /* renamed from: x */
    private final int f42878x;

    /* renamed from: y */
    private final long f42879y;

    /* renamed from: z */
    private String f42880z;
    public static final C7923b Companion = new C7923b(null);
    public static final Parcelable.Creator<TargetBackupInfo> CREATOR = new C7922a();

    /* renamed from: com.zing.zalo.data.backuprestore.model.TargetBackupInfo$a */
    /* loaded from: classes3.dex */
    public static final class C7922a implements Parcelable.Creator {
        C7922a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TargetBackupInfo createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "source");
            return new TargetBackupInfo(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public TargetBackupInfo[] newArray(int i11) {
            return new TargetBackupInfo[i11];
        }
    }

    /* renamed from: com.zing.zalo.data.backuprestore.model.TargetBackupInfo$b */
    /* loaded from: classes3.dex */
    public static final class C7923b {
        private C7923b() {
        }

        public /* synthetic */ C7923b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0101 A[Catch: Exception -> 0x01a8, TryCatch #3 {Exception -> 0x01a8, blocks: (B:20:0x00fb, B:22:0x0101, B:24:0x010e, B:26:0x0116), top: B:19:0x00fb }] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01c8  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final TargetBackupInfo m40970a(JSONObject jSONObject) {
            String str;
            long j11;
            String str2;
            long j12;
            long j13;
            long j14;
            int i11;
            Exception exc;
            String str3;
            int i12;
            int i13;
            JSONObject jSONObject2;
            String str4;
            String str5;
            int i14;
            String optString;
            int i15;
            long j15;
            String str6;
            long j16;
            AbstractC19074t.m100208f(jSONObject, "json");
            int optInt = jSONObject.optInt("device_type", 1);
            String str7 = "";
            String optString2 = jSONObject.optString("model_code", "");
            try {
                str = AbstractC23244v8.m119743g(URLDecoder.decode(jSONObject.optString("device_name"), "utf-8"), 50);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                str = optString2;
            }
            String optString3 = jSONObject.optString("file_name");
            String optString4 = jSONObject.optString("checksum");
            String optString5 = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            long optLong = jSONObject.optLong("client_time");
            long optLong2 = jSONObject.optLong("time");
            long optLong3 = jSONObject.optLong("file_size");
            int optInt2 = jSONObject.optInt("version");
            if (optLong <= 0) {
                optLong = jSONObject.optLong("time", -1L);
            }
            long optLong4 = jSONObject.optLong("client_version");
            try {
                String optString6 = jSONObject.optString("cloud_info", "");
                if (!TextUtils.isEmpty(optString6.toString())) {
                    JSONObject jSONObject3 = new JSONObject(optString6);
                    String optString7 = jSONObject3.optString("email");
                    AbstractC19074t.m100207e(optString7, "optString(...)");
                    j16 = jSONObject3.optLong("document_size", 0L);
                    j13 = jSONObject3.optLong("media_size", 0L);
                    j11 = -1;
                    try {
                        j15 = jSONObject3.optLong("time", -1L);
                        str6 = optString7;
                    } catch (Exception e12) {
                        e = e12;
                        AbstractC23350e.m122778h(e);
                        C26220b.m134827j("Invalid Backup Info json: " + jSONObject, null, 2, null);
                        str2 = "";
                        j12 = j11;
                        j13 = j12;
                        j14 = j13;
                        int i16 = 0;
                        int optInt3 = jSONObject.optInt("sync_messages", 0);
                        String optString8 = jSONObject.optString("sync_session", "");
                        long optLong5 = jSONObject.optLong("message_count");
                        if (!jSONObject.has("db_info")) {
                        }
                        str5 = "";
                        str4 = str5;
                        i14 = 0;
                        jSONObject2 = null;
                        i12 = 0;
                        i13 = 1;
                        int optInt4 = jSONObject.optInt("backup_storage", -1);
                        AbstractC19074t.m100205c(str);
                        AbstractC19074t.m100205c(optString3);
                        AbstractC19074t.m100205c(optString4);
                        AbstractC19074t.m100205c(optString5);
                        AbstractC19074t.m100205c(optString8);
                        TargetBackupInfo targetBackupInfo = new TargetBackupInfo(optInt, str, optString3, optString4, optString5, optLong, optLong2, optLong3, optInt2, optLong5, str2, j12, j13, j14, optInt3, optString8, jSONObject2, i14, i12, str5, optLong4, str4, i13, optInt4);
                        AbstractC19074t.m100205c(optString2);
                        targetBackupInfo.m40944D(optString2);
                        return targetBackupInfo;
                    }
                } else {
                    j15 = -1;
                    str6 = "";
                    j16 = -1;
                    j13 = -1;
                }
                str2 = str6;
                j14 = j16;
                j12 = j15;
            } catch (Exception e13) {
                e = e13;
                j11 = -1;
            }
            int i162 = 0;
            int optInt32 = jSONObject.optInt("sync_messages", 0);
            String optString82 = jSONObject.optString("sync_session", "");
            long optLong52 = jSONObject.optLong("message_count");
            try {
            } catch (Exception e14) {
                e = e14;
                i11 = 1;
            }
            if (!jSONObject.has("db_info")) {
                String optString9 = jSONObject.optString("db_info");
                AbstractC19074t.m100205c(optString9);
                if (optString9.length() > 0 && !AbstractC19074t.m100204b(optString9, "null")) {
                    jSONObject2 = new JSONObject(optString9);
                    int optInt5 = jSONObject2.optInt("db_format", 0);
                    try {
                        optString = jSONObject2.optString("db_secret_sha256", "");
                        AbstractC19074t.m100207e(optString, "optString(...)");
                    } catch (Exception e15) {
                        i11 = 1;
                        exc = e15;
                        str3 = "";
                        i162 = optInt5;
                    }
                    try {
                        i12 = jSONObject2.optInt("db_encrypt_type", 0);
                        try {
                            if (jSONObject2.has("compress_ratio")) {
                                try {
                                    int i17 = jSONObject2.getInt("compress_ratio");
                                    if (1 <= i17 && i17 < 90 && optInt5 == 1 && AbstractC0924m0.m3590Y2() != i17) {
                                        AbstractC0924m0.m3549Wj(i17);
                                    }
                                } catch (Exception e16) {
                                    exc = e16;
                                    str3 = "";
                                    i162 = optInt5;
                                    str7 = optString;
                                    i11 = 1;
                                    AbstractC23350e.m122778h(exc);
                                    C26220b.m134827j("Invalid Backup Info json: " + jSONObject, null, 2, null);
                                    jSONObject2 = null;
                                    str5 = str7;
                                    i13 = i11;
                                    str4 = str3;
                                    i14 = i162;
                                    int optInt42 = jSONObject.optInt("backup_storage", -1);
                                    AbstractC19074t.m100205c(str);
                                    AbstractC19074t.m100205c(optString3);
                                    AbstractC19074t.m100205c(optString4);
                                    AbstractC19074t.m100205c(optString5);
                                    AbstractC19074t.m100205c(optString82);
                                    TargetBackupInfo targetBackupInfo2 = new TargetBackupInfo(optInt, str, optString3, optString4, optString5, optLong, optLong2, optLong3, optInt2, optLong52, str2, j12, j13, j14, optInt32, optString82, jSONObject2, i14, i12, str5, optLong4, str4, i13, optInt42);
                                    AbstractC19074t.m100205c(optString2);
                                    targetBackupInfo2.m40944D(optString2);
                                    return targetBackupInfo2;
                                }
                            }
                            if (jSONObject2.has("hidden_chat")) {
                                String optString10 = jSONObject2.optString("hidden_chat");
                                AbstractC19074t.m100205c(optString10);
                                str7 = optString10;
                            }
                            String optString11 = jSONObject2.optString("allow_e2ee_chat");
                            AbstractC19074t.m100205c(optString11);
                            if (optString11.length() > 0) {
                                i15 = Integer.parseInt(optString11);
                                try {
                                    AbstractC23350e.m122780j("allowE2EEChat", Integer.valueOf(i15));
                                } catch (Exception e17) {
                                    i11 = i15;
                                    i162 = optInt5;
                                    exc = e17;
                                    str3 = str7;
                                    str7 = optString;
                                    AbstractC23350e.m122778h(exc);
                                    C26220b.m134827j("Invalid Backup Info json: " + jSONObject, null, 2, null);
                                    jSONObject2 = null;
                                    str5 = str7;
                                    i13 = i11;
                                    str4 = str3;
                                    i14 = i162;
                                    int optInt422 = jSONObject.optInt("backup_storage", -1);
                                    AbstractC19074t.m100205c(str);
                                    AbstractC19074t.m100205c(optString3);
                                    AbstractC19074t.m100205c(optString4);
                                    AbstractC19074t.m100205c(optString5);
                                    AbstractC19074t.m100205c(optString82);
                                    TargetBackupInfo targetBackupInfo22 = new TargetBackupInfo(optInt, str, optString3, optString4, optString5, optLong, optLong2, optLong3, optInt2, optLong52, str2, j12, j13, j14, optInt32, optString82, jSONObject2, i14, i12, str5, optLong4, str4, i13, optInt422);
                                    AbstractC19074t.m100205c(optString2);
                                    targetBackupInfo22.m40944D(optString2);
                                    return targetBackupInfo22;
                                }
                            } else {
                                i15 = 1;
                            }
                            i13 = i15;
                            str4 = str7;
                            i14 = optInt5;
                            str5 = optString;
                        } catch (Exception e18) {
                            i11 = 1;
                            exc = e18;
                            str3 = str7;
                            i162 = optInt5;
                        }
                    } catch (Exception e19) {
                        i11 = 1;
                        exc = e19;
                        str3 = "";
                        i162 = optInt5;
                        str7 = optString;
                        i12 = 0;
                        AbstractC23350e.m122778h(exc);
                        C26220b.m134827j("Invalid Backup Info json: " + jSONObject, null, 2, null);
                        jSONObject2 = null;
                        str5 = str7;
                        i13 = i11;
                        str4 = str3;
                        i14 = i162;
                        int optInt4222 = jSONObject.optInt("backup_storage", -1);
                        AbstractC19074t.m100205c(str);
                        AbstractC19074t.m100205c(optString3);
                        AbstractC19074t.m100205c(optString4);
                        AbstractC19074t.m100205c(optString5);
                        AbstractC19074t.m100205c(optString82);
                        TargetBackupInfo targetBackupInfo222 = new TargetBackupInfo(optInt, str, optString3, optString4, optString5, optLong, optLong2, optLong3, optInt2, optLong52, str2, j12, j13, j14, optInt32, optString82, jSONObject2, i14, i12, str5, optLong4, str4, i13, optInt4222);
                        AbstractC19074t.m100205c(optString2);
                        targetBackupInfo222.m40944D(optString2);
                        return targetBackupInfo222;
                    }
                    int optInt42222 = jSONObject.optInt("backup_storage", -1);
                    AbstractC19074t.m100205c(str);
                    AbstractC19074t.m100205c(optString3);
                    AbstractC19074t.m100205c(optString4);
                    AbstractC19074t.m100205c(optString5);
                    AbstractC19074t.m100205c(optString82);
                    TargetBackupInfo targetBackupInfo2222 = new TargetBackupInfo(optInt, str, optString3, optString4, optString5, optLong, optLong2, optLong3, optInt2, optLong52, str2, j12, j13, j14, optInt32, optString82, jSONObject2, i14, i12, str5, optLong4, str4, i13, optInt42222);
                    AbstractC19074t.m100205c(optString2);
                    targetBackupInfo2222.m40944D(optString2);
                    return targetBackupInfo2222;
                }
                i11 = 1;
                try {
                    C26220b.m134819b(new IllegalArgumentException("Invalid Backup Info json: " + jSONObject));
                } catch (Exception e21) {
                    e = e21;
                    exc = e;
                    str3 = "";
                    i12 = 0;
                    AbstractC23350e.m122778h(exc);
                    C26220b.m134827j("Invalid Backup Info json: " + jSONObject, null, 2, null);
                    jSONObject2 = null;
                    str5 = str7;
                    i13 = i11;
                    str4 = str3;
                    i14 = i162;
                    int optInt422222 = jSONObject.optInt("backup_storage", -1);
                    AbstractC19074t.m100205c(str);
                    AbstractC19074t.m100205c(optString3);
                    AbstractC19074t.m100205c(optString4);
                    AbstractC19074t.m100205c(optString5);
                    AbstractC19074t.m100205c(optString82);
                    TargetBackupInfo targetBackupInfo22222 = new TargetBackupInfo(optInt, str, optString3, optString4, optString5, optLong, optLong2, optLong3, optInt2, optLong52, str2, j12, j13, j14, optInt32, optString82, jSONObject2, i14, i12, str5, optLong4, str4, i13, optInt422222);
                    AbstractC19074t.m100205c(optString2);
                    targetBackupInfo22222.m40944D(optString2);
                    return targetBackupInfo22222;
                }
            }
            str5 = "";
            str4 = str5;
            i14 = 0;
            jSONObject2 = null;
            i12 = 0;
            i13 = 1;
            int optInt4222222 = jSONObject.optInt("backup_storage", -1);
            AbstractC19074t.m100205c(str);
            AbstractC19074t.m100205c(optString3);
            AbstractC19074t.m100205c(optString4);
            AbstractC19074t.m100205c(optString5);
            AbstractC19074t.m100205c(optString82);
            TargetBackupInfo targetBackupInfo222222 = new TargetBackupInfo(optInt, str, optString3, optString4, optString5, optLong, optLong2, optLong3, optInt2, optLong52, str2, j12, j13, j14, optInt32, optString82, jSONObject2, i14, i12, str5, optLong4, str4, i13, optInt4222222);
            AbstractC19074t.m100205c(optString2);
            targetBackupInfo222222.m40944D(optString2);
            return targetBackupInfo222222;
        }
    }

    public /* synthetic */ TargetBackupInfo(Parcel parcel, AbstractC19060k abstractC19060k) {
        this(parcel);
    }

    /* renamed from: B */
    public final void m40942B(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42880z = str;
    }

    /* renamed from: C */
    public final void m40943C(long j11) {
        this.f42856A = j11;
    }

    /* renamed from: D */
    public final void m40944D(String str) {
        AbstractC19074t.m100208f(str, "modelCode");
        this.f42869N = str;
    }

    /* renamed from: a */
    public final int m40945a() {
        return this.f42867L;
    }

    /* renamed from: b */
    public final long m40946b() {
        return this.f42858C;
    }

    /* renamed from: c */
    public final long m40947c() {
        return this.f42857B;
    }

    /* renamed from: d */
    public final int m40948d() {
        return this.f42868M;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m40949e() {
        return this.f42873s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TargetBackupInfo)) {
            return false;
        }
        TargetBackupInfo targetBackupInfo = (TargetBackupInfo) obj;
        return this.f42870p == targetBackupInfo.f42870p && AbstractC19074t.m100204b(this.f42871q, targetBackupInfo.f42871q) && AbstractC19074t.m100204b(this.f42872r, targetBackupInfo.f42872r) && AbstractC19074t.m100204b(this.f42873s, targetBackupInfo.f42873s) && AbstractC19074t.m100204b(this.f42874t, targetBackupInfo.f42874t) && this.f42875u == targetBackupInfo.f42875u && this.f42876v == targetBackupInfo.f42876v && this.f42877w == targetBackupInfo.f42877w && this.f42878x == targetBackupInfo.f42878x && this.f42879y == targetBackupInfo.f42879y && AbstractC19074t.m100204b(this.f42880z, targetBackupInfo.f42880z) && this.f42856A == targetBackupInfo.f42856A && this.f42857B == targetBackupInfo.f42857B && this.f42858C == targetBackupInfo.f42858C && this.f42859D == targetBackupInfo.f42859D && AbstractC19074t.m100204b(this.f42860E, targetBackupInfo.f42860E) && AbstractC19074t.m100204b(this.f42861F, targetBackupInfo.f42861F) && this.f42862G == targetBackupInfo.f42862G && this.f42863H == targetBackupInfo.f42863H && AbstractC19074t.m100204b(this.f42864I, targetBackupInfo.f42864I) && this.f42865J == targetBackupInfo.f42865J && AbstractC19074t.m100204b(this.f42866K, targetBackupInfo.f42866K) && this.f42867L == targetBackupInfo.f42867L && this.f42868M == targetBackupInfo.f42868M;
    }

    /* renamed from: f */
    public final long m40950f() {
        return this.f42875u;
    }

    /* renamed from: g */
    public final long m40951g() {
        return this.f42865J;
    }

    /* renamed from: h */
    public final long m40952h() {
        return this.f42876v;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((this.f42870p * 31) + this.f42871q.hashCode()) * 31) + this.f42872r.hashCode()) * 31) + this.f42873s.hashCode()) * 31) + this.f42874t.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f42875u)) * 31) + AbstractC2147g0.m11521a(this.f42876v)) * 31) + AbstractC2147g0.m11521a(this.f42877w)) * 31) + this.f42878x) * 31) + AbstractC2147g0.m11521a(this.f42879y)) * 31) + this.f42880z.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f42856A)) * 31) + AbstractC2147g0.m11521a(this.f42857B)) * 31) + AbstractC2147g0.m11521a(this.f42858C)) * 31) + this.f42859D) * 31) + this.f42860E.hashCode()) * 31;
        JSONObject jSONObject = this.f42861F;
        return ((((((((((((((hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31) + this.f42862G) * 31) + this.f42863H) * 31) + this.f42864I.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f42865J)) * 31) + this.f42866K.hashCode()) * 31) + this.f42867L) * 31) + this.f42868M;
    }

    /* renamed from: i */
    public final int m40953i() {
        return this.f42863H;
    }

    public final boolean isValid() {
        return this.f42877w > 0 && this.f42876v > 0;
    }

    /* renamed from: j */
    public final int m40954j() {
        return this.f42862G;
    }

    /* renamed from: k */
    public final JSONObject m40955k() {
        return this.f42861F;
    }

    /* renamed from: l */
    public final String m40956l() {
        return this.f42864I;
    }

    /* renamed from: m */
    public final String m40957m() {
        return this.f42871q;
    }

    /* renamed from: n */
    public final String m40958n() {
        int i11;
        boolean z11;
        String str = this.f42871q;
        int length = str.length() - 1;
        int i12 = 0;
        boolean z12 = false;
        while (i12 <= length) {
            if (!z12) {
                i11 = i12;
            } else {
                i11 = length;
            }
            if (AbstractC19074t.m100209g(str.charAt(i11), 32) <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z12) {
                if (!z11) {
                    z12 = true;
                } else {
                    i12++;
                }
            } else {
                if (!z11) {
                    break;
                }
                length--;
            }
        }
        return str.subSequence(i12, length + 1).toString();
    }

    /* renamed from: o */
    public final String m40959o() {
        return this.f42880z;
    }

    /* renamed from: p */
    public final long m40960p() {
        return this.f42877w;
    }

    /* renamed from: q */
    public final String m40961q() {
        return this.f42866K;
    }

    /* renamed from: t */
    public final long m40962t() {
        return this.f42856A;
    }

    public String toString() {
        return "TargetBackupInfo{deviceName='" + this.f42871q + "', fileName='" + this.f42872r + "', clientTime=" + this.f42875u + ", fileSize=" + this.f42877w + ", version=" + this.f42878x + ", messageCount=" + this.f42879y + ", backupStorage=" + this.f42868M + "}";
    }

    /* renamed from: u */
    public final String m40963u() {
        return this.f42869N;
    }

    /* renamed from: w */
    public final String m40964w() {
        return this.f42874t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        String str;
        AbstractC19074t.m100208f(parcel, "dest");
        parcel.writeInt(this.f42870p);
        parcel.writeString(this.f42871q);
        parcel.writeString(this.f42872r);
        parcel.writeString(this.f42873s);
        parcel.writeString(this.f42874t);
        parcel.writeLong(this.f42875u);
        parcel.writeLong(this.f42876v);
        parcel.writeLong(this.f42877w);
        parcel.writeInt(this.f42878x);
        parcel.writeLong(this.f42879y);
        parcel.writeString(this.f42880z);
        parcel.writeLong(this.f42856A);
        parcel.writeLong(this.f42857B);
        parcel.writeLong(this.f42858C);
        parcel.writeInt(this.f42859D);
        parcel.writeString(this.f42860E);
        JSONObject jSONObject = this.f42861F;
        if (jSONObject == null || (str = jSONObject.toString()) == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeInt(this.f42862G);
        parcel.writeInt(this.f42863H);
        parcel.writeString(this.f42864I);
        parcel.writeLong(this.f42865J);
        parcel.writeString(this.f42866K);
        parcel.writeInt(this.f42867L);
        parcel.writeInt(this.f42868M);
    }

    /* renamed from: x */
    public final void m40965x(long j11) {
        this.f42858C = j11;
    }

    /* renamed from: y */
    public final void m40966y(long j11) {
        this.f42857B = j11;
    }

    /* renamed from: z */
    public final void m40967z(int i11) {
        this.f42870p = i11;
    }

    public TargetBackupInfo(int i11, String str, String str2, String str3, String str4, long j11, long j12, long j13, int i12, long j14, String str5, long j15, long j16, long j17, int i13, String str6, JSONObject jSONObject, int i14, int i15, String str7, long j18, String str8, int i16, int i17) {
        AbstractC19074t.m100208f(str, "deviceName");
        AbstractC19074t.m100208f(str2, "fileName");
        AbstractC19074t.m100208f(str3, "checksum");
        AbstractC19074t.m100208f(str4, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str5, "email");
        AbstractC19074t.m100208f(str6, "syncSession");
        AbstractC19074t.m100208f(str7, "dbSecretSha256");
        AbstractC19074t.m100208f(str8, "hiddenInfoString");
        this.f42870p = i11;
        this.f42871q = str;
        this.f42872r = str2;
        this.f42873s = str3;
        this.f42874t = str4;
        this.f42875u = j11;
        this.f42876v = j12;
        this.f42877w = j13;
        this.f42878x = i12;
        this.f42879y = j14;
        this.f42880z = str5;
        this.f42856A = j15;
        this.f42857B = j16;
        this.f42858C = j17;
        this.f42859D = i13;
        this.f42860E = str6;
        this.f42861F = jSONObject;
        this.f42862G = i14;
        this.f42863H = i15;
        this.f42864I = str7;
        this.f42865J = j18;
        this.f42866K = str8;
        this.f42867L = i16;
        this.f42868M = i17;
        this.f42869N = "";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private TargetBackupInfo(Parcel parcel) {
        this(r1, r3, r4, r5, r6, r7, r9, r11, r13, r14, r16, r17, r19, r21, r23, r24, r26, r27, r28, r29, r33, r0 == null ? "" : r0, parcel.readInt(), parcel.readInt());
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        String str = readString == null ? "" : readString;
        String readString2 = parcel.readString();
        String str2 = readString2 == null ? "" : readString2;
        String readString3 = parcel.readString();
        String str3 = readString3 == null ? "" : readString3;
        String readString4 = parcel.readString();
        String str4 = readString4 == null ? "" : readString4;
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        long readLong3 = parcel.readLong();
        int readInt2 = parcel.readInt();
        long readLong4 = parcel.readLong();
        String readString5 = parcel.readString();
        String str5 = readString5 == null ? "" : readString5;
        long readLong5 = parcel.readLong();
        long readLong6 = parcel.readLong();
        long readLong7 = parcel.readLong();
        int readInt3 = parcel.readInt();
        String readString6 = parcel.readString();
        String str6 = readString6 == null ? "" : readString6;
        String readString7 = parcel.readString();
        JSONObject jSONObject = readString7 != null ? new JSONObject(readString7) : null;
        int readInt4 = parcel.readInt();
        int readInt5 = parcel.readInt();
        String readString8 = parcel.readString();
        String str7 = readString8 == null ? "" : readString8;
        long readLong8 = parcel.readLong();
        String readString9 = parcel.readString();
    }
}
