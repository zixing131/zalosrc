package com.zing.zalocore.connection.socket;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.NativeSocket;
import hm0.AbstractC20095b;
import hm0.C20096c;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jm0.InterfaceC21299i;
import jm0.InterfaceC21301k;
import jm0.InterfaceC21303m;
import mm0.AbstractC23349d;
import mm0.AbstractC23350e;
import mm0.AbstractC23351f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s00.AbstractC26080o;

/* renamed from: com.zing.zalocore.connection.socket.e */
/* loaded from: classes.dex */
public abstract class AbstractC17526e {

    /* renamed from: w */
    public static final int[] f89365w = {ZAbstractBase.ZVU_PROCESS_FLUSH, AbstractC26080o.a.f124275b, 10000, 20000, 30000, 60000, 90000, 120000, 150000, 180000, 210000, 240000, 270000, 300000};

    /* renamed from: x */
    public static final String[] f89366x = {".txt", ".jpg", ".gif", ".png", ".jpg", ".gif", ".png", ".png", ".png"};

    /* renamed from: y */
    public static final String[] f89367y = {".txt", ".jpg", ".gif", ".png", ".amr", ".amr", ".amr", ".png", ".amr"};

    /* renamed from: z */
    private static final IPPort f89368z = new IPPort("0.0.0.0", 0);

    /* renamed from: a */
    public final String f89369a = getClass().getSimpleName();

    /* renamed from: b */
    long f89370b = System.currentTimeMillis();

    /* renamed from: c */
    public int f89371c = 0;

    /* renamed from: d */
    private NativeSocket f89372d = null;

    /* renamed from: e */
    public boolean f89373e = false;

    /* renamed from: f */
    public boolean f89374f = false;

    /* renamed from: g */
    boolean f89375g = false;

    /* renamed from: h */
    public int f89376h = 0;

    /* renamed from: i */
    public int f89377i = 0;

    /* renamed from: j */
    protected int f89378j = -1;

    /* renamed from: k */
    protected int f89379k = -1;

    /* renamed from: l */
    private long f89380l = 0;

    /* renamed from: m */
    private long f89381m = 0;

    /* renamed from: n */
    public int f89382n = 0;

    /* renamed from: o */
    public long f89383o = 0;

    /* renamed from: p */
    public long f89384p = 0;

    /* renamed from: q */
    protected long f89385q = 0;

    /* renamed from: r */
    private long f89386r = 0;

    /* renamed from: s */
    private boolean f89387s = false;

    /* renamed from: t */
    public List f89388t = new ArrayList();

    /* renamed from: u */
    long f89389u = 0;

    /* renamed from: v */
    private String f89390v = "[" + getClass().getSimpleName() + "] ";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalocore.connection.socket.e$a */
    /* loaded from: classes7.dex */
    public class a extends NativeE2eeListener {

        /* renamed from: a */
        final /* synthetic */ byte[][] f89391a;

        a(byte[][] bArr) {
            this.f89391a = bArr;
        }

        @Override // com.zing.zalocore.connection.socket.NativeE2eeListener
        public void onRequestComplete(byte[] bArr, int i11) {
            this.f89391a[0] = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalocore.connection.socket.e$b */
    /* loaded from: classes7.dex */
    public class b extends NativeE2eeListener {

        /* renamed from: a */
        final /* synthetic */ byte[][] f89393a;

        b(byte[][] bArr) {
            this.f89393a = bArr;
        }

        @Override // com.zing.zalocore.connection.socket.NativeE2eeListener
        public void onRequestComplete(byte[] bArr, int i11) {
            this.f89393a[0] = bArr;
        }
    }

    /* renamed from: com.zing.zalocore.connection.socket.e$c */
    /* loaded from: classes7.dex */
    public class c extends NativeRequestListener {
        c(int i11, int i12, boolean z11, InterfaceC21299i interfaceC21299i) {
            super(i11, i12, z11, interfaceC21299i);
        }

        /* renamed from: b */
        private int m93435b(JSONObject jSONObject, String str) {
            try {
                if (jSONObject.has(str)) {
                    return jSONObject.getInt(str);
                }
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
            }
            return 0;
        }

        /* renamed from: c */
        private String m93436c(JSONObject jSONObject, String str) {
            try {
                if (jSONObject.has(str)) {
                    return jSONObject.getString(str).trim();
                }
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
            }
            return "";
        }

        @Override // com.zing.zalocore.connection.socket.NativeRequestListener
        void onProgressUpdate(int i11) {
            InterfaceC21299i interfaceC21299i = this.f89279c;
            if (interfaceC21299i instanceof InterfaceC21303m) {
                AbstractC20110a.m104544m("onProgressUpdate: %d ,percent: %d", Integer.valueOf(this.f89277a), Integer.valueOf(i11));
                try {
                    ((InterfaceC21303m) this.f89279c).mo51590a(i11);
                    return;
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    return;
                }
            }
            if (interfaceC21299i instanceof InterfaceC21301k) {
                AbstractC20110a.m104544m("onProgressUpdate: %d ,percent: %d", Integer.valueOf(this.f89277a), Integer.valueOf(i11));
                try {
                    ((InterfaceC21301k) this.f89279c).mo13369a(i11);
                } catch (Exception e12) {
                    AbstractC20110a.m104539h(e12);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0084 A[Catch: Exception -> 0x003d, TryCatch #1 {Exception -> 0x003d, blocks: (B:7:0x002d, B:10:0x0042, B:14:0x0055, B:16:0x005b, B:18:0x0065, B:20:0x007a, B:22:0x0084, B:23:0x008f, B:25:0x009b, B:26:0x00a1, B:28:0x00b3, B:30:0x00d5, B:31:0x00e0, B:33:0x00e6, B:34:0x00f1, B:36:0x00f7, B:37:0x0102, B:39:0x0108, B:40:0x0113, B:42:0x0119, B:43:0x0120, B:68:0x0138, B:45:0x013c, B:60:0x0152, B:55:0x015c, B:87:0x006a, B:89:0x0070, B:48:0x0156, B:57:0x0141), top: B:6:0x002d, inners: #4, #10 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009b A[Catch: Exception -> 0x003d, TryCatch #1 {Exception -> 0x003d, blocks: (B:7:0x002d, B:10:0x0042, B:14:0x0055, B:16:0x005b, B:18:0x0065, B:20:0x007a, B:22:0x0084, B:23:0x008f, B:25:0x009b, B:26:0x00a1, B:28:0x00b3, B:30:0x00d5, B:31:0x00e0, B:33:0x00e6, B:34:0x00f1, B:36:0x00f7, B:37:0x0102, B:39:0x0108, B:40:0x0113, B:42:0x0119, B:43:0x0120, B:68:0x0138, B:45:0x013c, B:60:0x0152, B:55:0x015c, B:87:0x006a, B:89:0x0070, B:48:0x0156, B:57:0x0141), top: B:6:0x002d, inners: #4, #10 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b3 A[Catch: Exception -> 0x003d, TryCatch #1 {Exception -> 0x003d, blocks: (B:7:0x002d, B:10:0x0042, B:14:0x0055, B:16:0x005b, B:18:0x0065, B:20:0x007a, B:22:0x0084, B:23:0x008f, B:25:0x009b, B:26:0x00a1, B:28:0x00b3, B:30:0x00d5, B:31:0x00e0, B:33:0x00e6, B:34:0x00f1, B:36:0x00f7, B:37:0x0102, B:39:0x0108, B:40:0x0113, B:42:0x0119, B:43:0x0120, B:68:0x0138, B:45:0x013c, B:60:0x0152, B:55:0x015c, B:87:0x006a, B:89:0x0070, B:48:0x0156, B:57:0x0141), top: B:6:0x002d, inners: #4, #10 }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x008d  */
        /* JADX WARN: Type inference failed for: r14v5, types: [org.json.JSONObject] */
        /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.String] */
        @Override // com.zing.zalocore.connection.socket.NativeRequestListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void onRenewComplete(byte[] bArr, long j11) {
            String str;
            String str2;
            JSONArray jSONArray;
            int i11;
            int m93435b;
            String m93436c;
            String str3;
            String m93436c2;
            String str4;
            int i12;
            String str5;
            String str6 = ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR;
            String str7 = "errorCode";
            String str8 = "data";
            if (this.f89279c != null) {
                try {
                    String str9 = new String(bArr);
                    Object[] objArr = new Object[1];
                    str2 = "";
                    try {
                        objArr[0] = str9;
                        AbstractC20110a.m104544m("onRenewComplete: %s", objArr);
                        if (str9.isEmpty()) {
                            str9 = "{}";
                        }
                        str = new JSONObject(str9);
                        jSONArray = new JSONArray(str.getString("data"));
                        try {
                        } catch (Exception e11) {
                            e = e11;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        str = str2;
                    }
                } catch (Exception e13) {
                    e = e13;
                    str = "";
                }
                if (jSONArray.length() > 0) {
                    int i13 = 0;
                    while (i13 < jSONArray.length()) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i13);
                        if (jSONObject.has(str7)) {
                            m93435b = m93435b(jSONObject, str7);
                        } else if (jSONObject.has(str6)) {
                            m93435b = m93435b(jSONObject, str6);
                        } else {
                            i11 = -1;
                            m93436c = m93436c(jSONObject, "org");
                            if (!TextUtils.isEmpty(m93436c)) {
                                str3 = str6;
                                m93436c = m93436c(jSONObject, "img");
                            } else {
                                str3 = str6;
                            }
                            m93436c2 = m93436c(jSONObject, "normal");
                            if (TextUtils.isEmpty(m93436c2)) {
                                m93436c2 = m93436c(jSONObject, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                            }
                            String str10 = str7;
                            String m93436c3 = m93436c(jSONObject, "hd");
                            JSONArray jSONArray2 = jSONArray;
                            String m93436c4 = m93436c(jSONObject, "thumb");
                            if (TextUtils.isEmpty(m93436c)) {
                                i12 = i13;
                                JSONObject jSONObject2 = new JSONObject();
                                String str11 = str8;
                                jSONObject2.put("error_code", i11);
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.putOpt("org", m93436c2);
                                jSONObject3.putOpt("thumb", m93436c4);
                                jSONObject3.putOpt("hd", m93436c3);
                                if (jSONObject.has("thumbSize")) {
                                    jSONObject3.putOpt("thumbSize", Integer.valueOf(m93435b(jSONObject, "thumbSize")));
                                }
                                if (jSONObject.has("orgSize")) {
                                    jSONObject3.putOpt("orgSize", Integer.valueOf(m93435b(jSONObject, "orgSize")));
                                }
                                if (jSONObject.has("hdSize")) {
                                    jSONObject3.putOpt("hdSize", Integer.valueOf(m93435b(jSONObject, "hdSize")));
                                }
                                if (jSONObject.has("fileSize")) {
                                    jSONObject3.putOpt("fileSize", Integer.valueOf(m93435b(jSONObject, "fileSize")));
                                }
                                if (jSONObject.has("convertible")) {
                                    jSONObject3.putOpt("convertible", m93436c(jSONObject, "convertible"));
                                }
                                str4 = str11;
                                jSONObject2.putOpt(str4, jSONObject3);
                                InterfaceC21299i interfaceC21299i = this.f89279c;
                                if (interfaceC21299i instanceof InterfaceC21303m) {
                                    try {
                                        try {
                                            ((InterfaceC21303m) interfaceC21299i).mo51591b(jSONObject2, false);
                                        } catch (Exception e14) {
                                            e = e14;
                                            AbstractC20110a.m104539h(e);
                                            str5 = str2;
                                            str8 = str4;
                                            str2 = str5;
                                            str6 = str3;
                                            str7 = str10;
                                            jSONArray = jSONArray2;
                                            i13 = i12 + 1;
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                    }
                                } else {
                                    if (interfaceC21299i instanceof InterfaceC21301k) {
                                        try {
                                            ((InterfaceC21301k) interfaceC21299i).mo13370d(jSONObject2, 2, j11, 0L);
                                        } catch (Exception e16) {
                                            AbstractC20110a.m104539h(e16);
                                        }
                                    } else {
                                        try {
                                            interfaceC21299i.mo1343f(jSONObject2);
                                        } catch (Exception e17) {
                                            AbstractC20110a.m104539h(e17);
                                        }
                                    }
                                    e = e12;
                                    str = str2;
                                    AbstractC20110a.m104539h(e);
                                    try {
                                        this.f89279c.mo1342c(new C20096c(502, AbstractC17526e.this.mo93391S(502, str)));
                                        return;
                                    } catch (Exception e18) {
                                        AbstractC20110a.m104539h(e18);
                                        return;
                                    }
                                }
                                str5 = str2;
                            } else {
                                str4 = str8;
                                i12 = i13;
                                try {
                                    str5 = str2;
                                    try {
                                        this.f89279c.mo1342c(new C20096c(502, AbstractC17526e.this.mo93391S(502, str5)));
                                    } catch (Exception e19) {
                                        e = e19;
                                        AbstractC20110a.m104539h(e);
                                        str8 = str4;
                                        str2 = str5;
                                        str6 = str3;
                                        str7 = str10;
                                        jSONArray = jSONArray2;
                                        i13 = i12 + 1;
                                    }
                                } catch (Exception e21) {
                                    e = e21;
                                    str5 = str2;
                                }
                            }
                            str8 = str4;
                            str2 = str5;
                            str6 = str3;
                            str7 = str10;
                            jSONArray = jSONArray2;
                            i13 = i12 + 1;
                        }
                        i11 = m93435b;
                        m93436c = m93436c(jSONObject, "org");
                        if (!TextUtils.isEmpty(m93436c)) {
                        }
                        m93436c2 = m93436c(jSONObject, "normal");
                        if (TextUtils.isEmpty(m93436c2)) {
                        }
                        String str102 = str7;
                        String m93436c32 = m93436c(jSONObject, "hd");
                        JSONArray jSONArray22 = jSONArray;
                        String m93436c42 = m93436c(jSONObject, "thumb");
                        if (TextUtils.isEmpty(m93436c)) {
                        }
                        str8 = str4;
                        str2 = str5;
                        str6 = str3;
                        str7 = str102;
                        jSONArray = jSONArray22;
                        i13 = i12 + 1;
                    }
                    return;
                }
                str = str2;
                try {
                    this.f89279c.mo1342c(new C20096c(502, AbstractC17526e.this.mo93391S(502, str)));
                } catch (Exception e22) {
                    AbstractC20110a.m104539h(e22);
                }
            }
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ad -> B:22:0x00c6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00c3 -> B:22:0x00c6). Please report as a decompilation issue!!! */
        @Override // com.zing.zalocore.connection.socket.NativeRequestListener
        void onRequestComplete(byte[] bArr, int i11, long j11, long j12) {
            boolean z11;
            JSONObject jSONObject;
            InterfaceC21299i interfaceC21299i;
            if (i11 == 0) {
                AbstractC17526e.this.f89370b = System.currentTimeMillis();
            }
            if (this.f89279c != null) {
                if (i11 > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                try {
                    try {
                        String str = new String(bArr);
                        AbstractC20110a.m104544m("onRequestComplete http: %d json: %s", Integer.valueOf(i11), str);
                        if (str.isEmpty()) {
                            str = "{}";
                        }
                        jSONObject = new JSONObject(str);
                        interfaceC21299i = this.f89279c;
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                        this.f89279c.mo1342c(new C20096c(502, AbstractC17526e.this.mo93391S(502, "")));
                    }
                } catch (Exception e12) {
                    AbstractC20110a.m104539h(e12);
                }
                if (interfaceC21299i instanceof InterfaceC21303m) {
                    try {
                        ((InterfaceC21303m) interfaceC21299i).mo51591b(jSONObject, z11);
                    } catch (Exception e13) {
                        AbstractC20110a.m104539h(e13);
                    }
                } else if (interfaceC21299i instanceof InterfaceC21301k) {
                    try {
                        ((InterfaceC21301k) interfaceC21299i).mo13370d(jSONObject, AbstractC17526e.this.m93360a(i11, j11, j12), j11, j12);
                    } catch (Exception e14) {
                        AbstractC20110a.m104539h(e14);
                    }
                } else {
                    int m93435b = m93435b(jSONObject, "error_code");
                    if (m93435b == 0) {
                        try {
                            this.f89279c.mo1343f(jSONObject);
                        } catch (Exception e15) {
                            AbstractC20110a.m104539h(e15);
                        }
                    } else {
                        String m93436c = m93436c(jSONObject, "error_message_localize");
                        String m93436c2 = m93436c(jSONObject, "data");
                        C20096c c20096c = new C20096c(m93435b, AbstractC17526e.this.mo93391S(m93435b, m93436c));
                        c20096c.m104494f(m93436c2);
                        try {
                            this.f89279c.mo1342c(c20096c);
                        } catch (Exception e16) {
                            AbstractC20110a.m104539h(e16);
                        }
                    }
                }
                AbstractC20110a.m104539h(e11);
                this.f89279c.mo1342c(new C20096c(502, AbstractC17526e.this.mo93391S(502, "")));
            }
            AbstractC17526e.this.f89376h = 0;
        }

        @Override // com.zing.zalocore.connection.socket.NativeRequestListener
        void onRequestFailed(int i11, byte[] bArr, int i12, long j11, long j12) {
            C20096c c20096c;
            AbstractC20110a.m104538g("onRequestFailed: %d - errCode: %d", Integer.valueOf(this.f89277a), Integer.valueOf(i11));
            try {
                if (m93203a()) {
                    c20096c = new C20096c(i11, Arrays.toString(bArr));
                } else {
                    InterfaceC21299i interfaceC21299i = this.f89279c;
                    if (!(interfaceC21299i instanceof InterfaceC21303m) && !(interfaceC21299i instanceof InterfaceC21301k)) {
                        c20096c = new C20096c(i11, AbstractC17526e.this.mo93391S(i11, ""));
                    }
                    if (i11 != 17007 && i11 != 18026 && i11 != 18027 && i11 != 18019 && i11 != 204 && i11 != -13) {
                        if (i11 != -17 && i11 != -18 && i11 != -19 && i11 != -20 && i11 != -69 && i11 != -70) {
                            c20096c = new C20096c(502, AbstractC17526e.this.mo93391S(502, ""));
                        }
                        c20096c = new C20096c(i11, AbstractC17526e.this.mo93391S(502, ""));
                    }
                    c20096c = new C20096c(i11, AbstractC17526e.this.mo93391S(502, ""));
                    if (i11 == 18026 || i11 == 18027) {
                        c20096c.m104494f(new String(bArr));
                    }
                }
                C20096c c20096c2 = c20096c;
                InterfaceC21299i interfaceC21299i2 = this.f89279c;
                if (interfaceC21299i2 != null) {
                    AbstractC17526e abstractC17526e = AbstractC17526e.this;
                    abstractC17526e.m93366g(interfaceC21299i2, c20096c2, abstractC17526e.m93360a(i12, j11, j12), j11, j12);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalocore.connection.socket.e$e */
    /* loaded from: classes7.dex */
    public class e extends NativeE2eeListener {

        /* renamed from: a */
        final /* synthetic */ byte[][] f89397a;

        e(byte[][] bArr) {
            this.f89397a = bArr;
        }

        @Override // com.zing.zalocore.connection.socket.NativeE2eeListener
        public void onRequestComplete(byte[] bArr, int i11) {
            this.f89397a[0] = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalocore.connection.socket.e$f */
    /* loaded from: classes7.dex */
    public class f extends NativeE2eeListener {

        /* renamed from: a */
        final /* synthetic */ Object[] f89399a;

        f(Object[] objArr) {
            this.f89399a = objArr;
        }

        @Override // com.zing.zalocore.connection.socket.NativeE2eeListener
        public void onRequestComplete(byte[] bArr, int i11) {
            this.f89399a[0] = Integer.valueOf(i11);
            Object[] objArr = this.f89399a;
            if (i11 != 0) {
                bArr = null;
            }
            objArr[1] = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalocore.connection.socket.e$g */
    /* loaded from: classes7.dex */
    public class g extends NativeE2eeListener {

        /* renamed from: a */
        final /* synthetic */ Object[] f89401a;

        g(Object[] objArr) {
            this.f89401a = objArr;
        }

        @Override // com.zing.zalocore.connection.socket.NativeE2eeListener
        public void onRequestComplete(byte[] bArr, int i11) {
            this.f89401a[0] = Integer.valueOf(i11);
            Object[] objArr = this.f89401a;
            if (i11 != 0) {
                bArr = null;
            }
            objArr[1] = bArr;
        }
    }

    /* renamed from: com.zing.zalocore.connection.socket.e$h */
    /* loaded from: classes7.dex */
    public class h extends NativeE2eeListener {

        /* renamed from: a */
        final /* synthetic */ Object[] f89403a;

        h(Object[] objArr) {
            this.f89403a = objArr;
        }

        @Override // com.zing.zalocore.connection.socket.NativeE2eeListener
        public void onRequestComplete(byte[] bArr, int i11) {
            Object[] objArr = this.f89403a;
            if (i11 != 0) {
                bArr = null;
            }
            objArr[1] = bArr;
            objArr[0] = Integer.valueOf(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalocore.connection.socket.e$i */
    /* loaded from: classes7.dex */
    public class i extends NativeE2eeListener {

        /* renamed from: a */
        final /* synthetic */ Object[] f89405a;

        i(Object[] objArr) {
            this.f89405a = objArr;
        }

        @Override // com.zing.zalocore.connection.socket.NativeE2eeListener
        public void onRequestComplete(byte[] bArr, int i11) {
            Object[] objArr = this.f89405a;
            if (i11 != 0) {
                bArr = null;
            }
            objArr[1] = bArr;
            objArr[0] = Integer.valueOf(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalocore.connection.socket.e$j */
    /* loaded from: classes7.dex */
    public class j extends NativeE2eeListener {

        /* renamed from: a */
        final /* synthetic */ Object[] f89407a;

        j(Object[] objArr) {
            this.f89407a = objArr;
        }

        @Override // com.zing.zalocore.connection.socket.NativeE2eeListener
        public void onRequestComplete(byte[] bArr, int i11) {
            Object[] objArr = this.f89407a;
            if (i11 != 0) {
                bArr = null;
            }
            objArr[1] = bArr;
            objArr[0] = Integer.valueOf(i11);
        }
    }

    /* renamed from: a */
    public int m93360a(int i11, long j11, long j12) {
        if (j11 > 0 && j12 <= 0) {
            return 2;
        }
        if (i11 == 1) {
            return 1;
        }
        return i11 == 2 ? 3 : 0;
    }

    /* renamed from: d */
    public void m93363d() {
        try {
            boolean z11 = true;
            if (this.f89373e) {
                this.f89381m = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Disconnect ");
                sb2.append(m93415m().m93159a());
                sb2.append(":");
                sb2.append(m93415m().m93160b());
                AbstractC23351f.m122784a(m93426t() + "Disconnect " + m93415m().m93159a() + ":" + m93415m().m93160b(), true);
            }
            if (CoreUtility.m93148a() == null || !CoreUtility.m93148a().mo100077e()) {
                z11 = false;
            }
            if (m93374B() || z11) {
                this.f89372d.m93242j(z11);
            }
            this.f89375g = false;
            this.f89374f = false;
            this.f89389u = 0L;
            this.f89385q = 0L;
            this.f89373e = false;
        } catch (Exception e11) {
            AbstractC23350e.m122774d(this.f89369a, e11.toString());
        }
        try {
            mo93377E();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: e */
    private void m93364e(int i11, String str) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = currentTimeMillis - this.f89386r;
            String m93162d = m93415m().m93162d();
            mo93376D(m93415m(), i11, str);
            mo93430v0(true, false, i11, 0, 0, j11, m93162d, this.f89386r, currentTimeMillis);
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public void m93366g(InterfaceC21299i interfaceC21299i, C20096c c20096c, int i11, long j11, long j12) {
        if (interfaceC21299i instanceof InterfaceC21301k) {
            ((InterfaceC21301k) interfaceC21299i).mo13371e(c20096c, i11, j11, j12);
        } else {
            interfaceC21299i.mo1342c(c20096c);
        }
    }

    /* renamed from: q0 */
    public static void m93368q0(boolean z11, long j11, boolean z12, long j12, boolean z13, long j13) {
        NativeSocket.m93215l(z11, j11, z12, j12, z13, j13);
    }

    /* renamed from: r0 */
    public static void m93369r0(long j11, long j12, long j13) {
        NativeSocket.m93212e(j11, j12, j13);
    }

    /* renamed from: s0 */
    public static void m93370s0(boolean z11, int i11) {
        NativeSocket.m93218r(z11, i11);
    }

    /* renamed from: t0 */
    public static void m93371t0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        NativeSocket.m93208N(str);
    }

    /* renamed from: w0 */
    public static void m93372w0(String str, String str2) {
        NativeSocket.m93213h(str, str2);
    }

    /* renamed from: A */
    public boolean m93373A() {
        if (m93374B()) {
            this.f89372d.m93222C();
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public boolean m93374B() {
        if (m93434z() && this.f89375g) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public void m93375C(int i11) {
        IPPort m93415m = m93415m();
        mo93378F(m93415m, i11, m93415m.m93162d() + " logAuthorizeSocketError " + i11, 0, 0);
        AbstractC23351f.m122784a("AuthorizeV3Info null", false);
    }

    /* renamed from: D */
    public abstract void mo93376D(IPPort iPPort, int i11, String str);

    /* renamed from: E */
    public abstract void mo93377E();

    /* renamed from: F */
    public abstract void mo93378F(IPPort iPPort, int i11, String str, int i12, int i13);

    /* renamed from: G */
    public void m93379G(long j11) {
        if (m93434z()) {
            this.f89372d.m93235a(j11);
        }
    }

    /* renamed from: H */
    public Pair m93380H(byte[] bArr, int i11) {
        return m93381I(bArr, i11, 0);
    }

    /* renamed from: I */
    public Pair m93381I(byte[] bArr, int i11, int i12) {
        Object[] objArr = new Object[2];
        NativeE2ee.m93176h(bArr, i11, i12, 0L, new h(objArr));
        return new Pair((Integer) objArr[0], (byte[]) objArr[1]);
    }

    /* renamed from: J */
    public Pair m93382J(byte[] bArr, int i11, int i12, long j11) {
        Object[] objArr = new Object[2];
        NativeE2ee.m93176h(bArr, i11, i12, j11, new i(objArr));
        return new Pair((Integer) objArr[0], (byte[]) objArr[1]);
    }

    /* renamed from: K */
    public Pair m93383K(byte[] bArr, int i11, int i12, int i13) {
        Object[] objArr = new Object[2];
        NativeE2ee.m93175g(bArr, i11, i12, i13, new j(objArr));
        return new Pair((Integer) objArr[0], (byte[]) objArr[1]);
    }

    /* renamed from: L */
    public void m93384L(int i11, int i12) {
        m93385M(i11, i12, 0);
    }

    /* renamed from: M */
    public void m93385M(int i11, int i12, int i13) {
        NativeE2ee.m93172d(i11, i12, i13);
    }

    /* renamed from: N */
    public void m93386N(int i11, int i12) {
        NativeE2ee.m93179k(i11, i12);
    }

    /* renamed from: O */
    public byte[] m93387O(byte[] bArr, int i11, int i12) {
        if (bArr != null && bArr.length != 0) {
            byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 1, 1);
            NativeE2ee.m93177i(bArr, i11, i12, new e(bArr2));
            return bArr2[0];
        }
        return null;
    }

    /* renamed from: P */
    public Pair m93388P(byte[] bArr, int i11) {
        int i12;
        if (bArr != null && bArr.length != 0) {
            Object[] objArr = new Object[2];
            if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                i12 = Integer.parseInt(CoreUtility.f89233i);
            } else {
                i12 = 0;
            }
            NativeE2ee.m93181m(bArr, i12, i11, new g(objArr));
            return new Pair((Integer) objArr[0], (byte[]) objArr[1]);
        }
        return new Pair(-1, null);
    }

    /* renamed from: Q */
    public Pair m93389Q(byte[] bArr, int i11, int i12) {
        if (bArr != null && bArr.length != 0) {
            Object[] objArr = new Object[2];
            NativeE2ee.m93177i(bArr, i11, i12, new f(objArr));
            return new Pair((Integer) objArr[0], (byte[]) objArr[1]);
        }
        return new Pair(-1, null);
    }

    /* renamed from: R */
    public int m93390R(int i11, boolean z11) {
        return NativeE2ee.m93170b(i11, z11);
    }

    /* renamed from: S */
    public abstract String mo93391S(int i11, String str);

    /* renamed from: T */
    public byte[] m93392T(byte[] bArr, int i11, int i12, int i13, int i14, long j11) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 1, 1);
        NativeE2ee.m93174f(bArr, i11, i12, i13, i14, j11, new a(bArr2));
        return bArr2[0];
    }

    /* renamed from: U */
    public byte[] m93393U(byte[] bArr, int i11, int i12, int i13, int i14, long j11) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 1, 1);
        NativeE2ee.m93180l(bArr, i11, i12, i13, i14, j11, new b(bArr2));
        return bArr2[0];
    }

    /* renamed from: V */
    public boolean m93394V(int i11, int i12) {
        return m93395W(i11, i12, 0);
    }

    /* renamed from: W */
    public boolean m93395W(int i11, int i12, int i13) {
        return NativeE2ee.m93182n(i11, i12, i13);
    }

    /* renamed from: X */
    public boolean m93396X(int i11, int i12) {
        if (NativeE2ee.m93185q(i11, i12) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public void m93397Y(boolean z11, int i11) {
        NativeSocket.m93214k(z11, i11);
    }

    /* renamed from: Z */
    public void m93398Z(int i11, int i12) {
        if (m93434z()) {
            this.f89372d.m93247t(i11);
            this.f89372d.m93223D(i12);
        }
    }

    /* renamed from: a0 */
    public void m93399a0() {
        if (m93374B()) {
            NativeSocket.m93206I();
        }
    }

    /* renamed from: b0 */
    public void m93400b0() {
        if (m93434z()) {
            this.f89372d.m93228L();
        }
    }

    /* renamed from: c0 */
    public void m93401c0(long j11, long j12) {
        if (m93374B()) {
            this.f89372d.m93236d(j11, j12);
        }
    }

    /* renamed from: d0 */
    public abstract void mo93402d0(String str);

    /* renamed from: e0 */
    public abstract void mo93403e0();

    /* renamed from: f0 */
    public abstract void mo93404f0();

    /* renamed from: g0 */
    public abstract void mo93405g0();

    /* renamed from: h0 */
    public abstract void mo93406h0(int i11, String str);

    /* renamed from: i */
    public abstract void mo93407i();

    /* renamed from: i0 */
    public abstract void mo93408i0(RequestPacket requestPacket);

    /* renamed from: j */
    public boolean m93409j(int i11) {
        try {
        } catch (Exception e11) {
            AbstractC23351f.m122784a(m93426t() + m93415m().m93159a() + ":" + m93415m().m93160b() + "Exception: " + e11.toString(), true);
            m93429v();
            mo93411k();
            m93364e(9003, e11.toString());
        }
        if (!AbstractC20626a.m107393i(CoreUtility.getAppContext())) {
            return false;
        }
        try {
            if (m93434z()) {
                this.f89389u = 0L;
            } else {
                AbstractC23351f.m122784a(m93426t() + "native socket connect fail", false);
                this.f89389u = 0L;
            }
            this.f89374f = true;
            mo93407i();
            this.f89386r = System.currentTimeMillis();
            System.currentTimeMillis();
            AbstractC23351f.m122784a(m93426t() + "----------------------", false);
            AbstractC23351f.m122784a(m93426t() + "Connect to server " + m93415m().m93159a() + ":" + m93415m().m93160b(), true);
            if (m93434z()) {
                this.f89372d.m93227K(CoreUtility.f89232h);
                this.f89372d.m93233S(CoreUtility.f89229e);
                this.f89372d.m93231P(CoreUtility.f89230f);
                this.f89372d.m93238g(CoreUtility.f89226b);
                this.f89372d.m93249v(mo93419o());
                this.f89372d.m93245q(mo93417n());
                this.f89372d.m93251y(AbstractC23349d.m122764b());
                this.f89372d.m93226H(AbstractC23349d.m122767e());
                this.f89372d.m93241i(this.f89388t);
                this.f89372d.m93230O(Integer.parseInt(CoreUtility.f89233i));
                this.f89372d.m93232R(CoreUtility.f89236l);
                this.f89372d.m93229M(AbstractC23349d.m122766d());
                this.f89372d.m93234T(CoreUtility.f89228d);
                this.f89372d.m93244p(CoreUtility.f89238n);
                this.f89372d.m93248u(CoreUtility.f89237m);
                this.f89372d.m93221A(CoreUtility.f89240p);
                this.f89372d.m93224E(CoreUtility.f89241q);
                NativeSocket nativeSocket = this.f89372d;
                if (i11 <= 0) {
                    i11 = 30000;
                }
                nativeSocket.m93243o(i11);
            } else {
                AbstractC23351f.m122784a(m93426t() + "native socket connect fail", false);
            }
            if (!this.f89373e) {
                m93429v();
            } else {
                this.f89380l = System.currentTimeMillis();
            }
            this.f89374f = false;
            this.f89389u = 0L;
        } catch (SecurityException e12) {
            AbstractC23351f.m122784a(m93426t() + m93415m().m93159a() + ":" + m93415m().m93160b() + "SecurityException: " + e12.toString(), true);
            String str = this.f89369a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Security policy does not allow connection to ");
            sb2.append(m93415m().m93159a());
            sb2.append(":");
            sb2.append(m93415m().m93160b());
            AbstractC23350e.m122774d(str, sb2.toString());
            m93429v();
            mo93411k();
            m93364e(9000, e12.toString());
        } catch (Exception e13) {
            AbstractC23351f.m122784a(m93426t() + m93415m().m93159a() + ":" + m93415m().m93160b() + "Exception: " + e13.toString(), true);
            m93429v();
            mo93411k();
            m93364e(9003, e13.toString());
        }
        return this.f89373e;
    }

    /* renamed from: j0 */
    public abstract void mo93410j0(RequestPacket requestPacket);

    /* renamed from: k */
    public void mo93411k() {
        m93363d();
    }

    /* renamed from: k0 */
    public void m93412k0(int i11) {
        String str;
        try {
            if (this.f89373e && (str = CoreUtility.f89233i) != null && !str.equals("")) {
                RequestPacket requestPacket = new RequestPacket();
                requestPacket.m93301w((byte) 3);
                requestPacket.m93302x((byte) 0);
                requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
                requestPacket.m93274E((byte) 3);
                requestPacket.m93295q((short) 3);
                requestPacket.m93275F((byte) 0);
                requestPacket.m93271B((byte) i11);
                m93413l(requestPacket, null);
            }
        } catch (Exception unused) {
        }
        mo93411k();
    }

    /* renamed from: l */
    public void m93413l(RequestPacket requestPacket, InterfaceC21299i interfaceC21299i) {
        int i11;
        if (m93434z()) {
            if (requestPacket.m93290l() == 0) {
                requestPacket.m93272C(this.f89372d.m93246s());
            }
            if (requestPacket.m93278a() == 1) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            requestPacket.m93277H((byte) i11);
            if (interfaceC21299i != null) {
                if (this.f89372d.m93250w() == 2000 && requestPacket.m93288j() <= 0) {
                    requestPacket.m93270A(AbstractC20626a.m107385a(0));
                    AbstractC20110a.m104544m("Update Timeout for cmd: %d, value: %d", Short.valueOf(requestPacket.m93278a()), Long.valueOf(requestPacket.m93288j()));
                }
                this.f89372d.m93237f(requestPacket, new c(requestPacket.m93290l(), requestPacket.m93278a(), requestPacket.m93283f(), interfaceC21299i));
                return;
            }
            this.f89372d.m93237f(requestPacket, null);
            return;
        }
        if (interfaceC21299i != null) {
            interfaceC21299i.mo1342c(new C20096c(502, AbstractC20095b.f98832d));
        }
    }

    /* renamed from: l0 */
    public void m93414l0() {
        this.f89382n = 0;
        this.f89384p = 0L;
    }

    /* renamed from: m */
    public IPPort m93415m() {
        return f89368z;
    }

    /* renamed from: m0 */
    public abstract void mo93416m0();

    /* renamed from: n */
    public abstract String mo93417n();

    /* renamed from: n0 */
    public void m93418n0(int i11) {
        NativeSocket.m93220z(i11);
    }

    /* renamed from: o */
    public abstract String mo93419o();

    /* renamed from: o0 */
    public void m93420o0(int i11) {
        NativeSocket.m93205G(i11);
    }

    /* renamed from: p */
    public long m93421p() {
        return this.f89370b;
    }

    /* renamed from: p0 */
    public void m93422p0(int i11) {
        NativeSocket.m93207J(i11);
    }

    /* renamed from: q */
    public long m93423q() {
        return this.f89381m - this.f89380l;
    }

    /* renamed from: r */
    public int m93424r() {
        return NativeE2ee.m93169a();
    }

    /* renamed from: s */
    public int m93425s(int i11, int i12) {
        return NativeE2ee.m93183o(i11, i12);
    }

    /* renamed from: t */
    public String m93426t() {
        return this.f89390v;
    }

    /* renamed from: u */
    public int m93427u() {
        if (AbstractC23349d.m122768f() == 2) {
            if (this.f89382n == 0) {
                if (m93423q() > 10000) {
                    this.f89382n = 1;
                } else {
                    this.f89382n = 2;
                }
            }
            if (this.f89382n > 7) {
                this.f89382n = 7;
            }
        } else if (AbstractC23349d.m122768f() == 3) {
            if (this.f89382n == 0) {
                if (m93423q() > 10000) {
                    this.f89382n = 2;
                } else {
                    this.f89382n = 3;
                }
            }
            int i11 = this.f89382n;
            int[] iArr = f89365w;
            if (i11 > iArr.length - 1) {
                this.f89382n = iArr.length - 1;
            }
        } else if (this.f89382n > 5) {
            this.f89382n = 5;
        }
        int i12 = this.f89382n;
        int[] iArr2 = f89365w;
        if (i12 > iArr2.length - 1) {
            this.f89382n = iArr2.length - 1;
        }
        return iArr2[this.f89382n];
    }

    /* renamed from: u0 */
    public void m93428u0(int i11) {
        NativeSocket.m93219x(i11);
    }

    /* renamed from: v */
    public void m93429v() {
        if (AbstractC23349d.m122769g()) {
            this.f89382n += 2;
        } else {
            this.f89382n++;
        }
    }

    /* renamed from: v0 */
    public abstract void mo93430v0(boolean z11, boolean z12, int i11, int i12, int i13, long j11, String str, long j12, long j13);

    /* renamed from: w */
    public void m93431w(int i11) {
        this.f89372d = new NativeSocket(i11, new d());
    }

    /* renamed from: x */
    public boolean m93432x() {
        return this.f89373e;
    }

    /* renamed from: y */
    public boolean m93433y() {
        return this.f89374f;
    }

    /* renamed from: z */
    public boolean m93434z() {
        return this.f89372d != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalocore.connection.socket.e$d */
    /* loaded from: classes.dex */
    public class d implements NativeSocket.InterfaceC17520b {
        d() {
        }

        @Override // com.zing.zalocore.connection.socket.NativeSocket.InterfaceC17520b
        /* renamed from: a */
        public void mo93252a() {
            AbstractC20110a.m104544m("native socket onRequestAutoLogin.....", new Object[0]);
            try {
                AbstractC17526e.this.mo93403e0();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // com.zing.zalocore.connection.socket.NativeSocket.InterfaceC17520b
        /* renamed from: b */
        public void mo93253b() {
            AbstractC20110a.m104544m("native socket onRequestUpdateKSet.....", new Object[0]);
            try {
                AbstractC17526e.this.mo93405g0();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // com.zing.zalocore.connection.socket.NativeSocket.InterfaceC17520b
        /* renamed from: c */
        public void mo93254c() {
            AbstractC20110a.m104544m("native socket type: %d connecting.....", Integer.valueOf(AbstractC17526e.this.f89372d.m93250w()));
            AbstractC17526e abstractC17526e = AbstractC17526e.this;
            abstractC17526e.f89375g = true;
            abstractC17526e.f89385q = SystemClock.elapsedRealtime();
        }

        @Override // com.zing.zalocore.connection.socket.NativeSocket.InterfaceC17520b
        /* renamed from: d */
        public void mo93256d(RequestPacket requestPacket) {
            AbstractC17526e.this.f89370b = System.currentTimeMillis();
            if (requestPacket.m93278a() == 1 && (requestPacket.m93284g() == 3 || requestPacket.m93284g() == 4)) {
                try {
                    if (requestPacket.m93289k() == -1 && !CoreUtility.f89232h.equals("") && !CoreUtility.f89232h.equals(AbstractC17526e.this.f89372d.gsk())) {
                        AbstractC17526e.this.m93363d();
                        AbstractC17526e.this.mo93416m0();
                    } else {
                        AbstractC17526e.this.mo93408i0(requestPacket);
                    }
                    AbstractC17526e.this.f89372d.m93225F();
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } else if (requestPacket.m93294p() >= 0 && requestPacket.m93294p() <= 2) {
                try {
                    AbstractC17526e.this.mo93410j0(requestPacket);
                } catch (Exception e12) {
                    AbstractC20110a.m104539h(e12);
                }
            }
            AbstractC17526e.this.f89389u = 0L;
        }

        @Override // com.zing.zalocore.connection.socket.NativeSocket.InterfaceC17520b
        /* renamed from: e */
        public void mo93257e(int i11, String str) {
            try {
                AbstractC17526e.this.mo93406h0(i11, str);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            if (i11 == 1) {
                AbstractC17526e.this.f89385q = SystemClock.elapsedRealtime();
                return;
            }
            AbstractC17526e abstractC17526e = AbstractC17526e.this;
            if (!abstractC17526e.f89373e && abstractC17526e.f89375g && i11 == 3) {
                abstractC17526e.f89373e = true;
            }
        }

        @Override // com.zing.zalocore.connection.socket.NativeSocket.InterfaceC17520b
        /* renamed from: f */
        public void mo93258f(boolean z11, boolean z12, int i11, int i12, int i13, long j11, long j12, long j13, String str) {
            try {
                AbstractC17526e.this.mo93430v0(z11, z12, i11, i12, i13, j11, str, j12, j13);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // com.zing.zalocore.connection.socket.NativeSocket.InterfaceC17520b
        /* renamed from: g */
        public void mo93259g(String str, int i11, int i12, int i13, int i14, long j11, long j12, String str2) {
            try {
                AbstractC17526e.this.mo93378F(new IPPort(str, i11), i12, str2, i13, i14);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // com.zing.zalocore.connection.socket.NativeSocket.InterfaceC17520b
        /* renamed from: h */
        public void mo93260h() {
            AbstractC20110a.m104544m("native socket onRequestGetLSers.....", new Object[0]);
            try {
                AbstractC17526e.this.mo93404f0();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // com.zing.zalocore.connection.socket.NativeSocket.InterfaceC17520b
        /* renamed from: i */
        public void mo93261i() {
            AbstractC20110a.m104544m("native socket type: %d disconnected.....", Integer.valueOf(AbstractC17526e.this.f89372d.m93250w()));
            AbstractC17526e abstractC17526e = AbstractC17526e.this;
            if (abstractC17526e.f89373e) {
                try {
                    abstractC17526e.mo93377E();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            AbstractC17526e abstractC17526e2 = AbstractC17526e.this;
            abstractC17526e2.f89385q = 0L;
            abstractC17526e2.f89373e = false;
        }

        @Override // com.zing.zalocore.connection.socket.NativeSocket.InterfaceC17520b
        /* renamed from: c */
        public void mo93255c(String str) {
            AbstractC20110a.m104544m("onReceiveHttpFailover json:%s", str);
            try {
                AbstractC17526e.this.mo93402d0(str);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }
}
