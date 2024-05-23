package com.zing.zalo.control;

import android.text.TextUtils;
import android.util.Pair;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p716zh.C31943h5;

/* renamed from: com.zing.zalo.control.e */
/* loaded from: classes3.dex */
public class C7907e {

    /* renamed from: a */
    private final List f42788a;

    /* renamed from: b */
    public boolean f42789b;

    /* renamed from: c */
    boolean f42790c;

    /* renamed from: com.zing.zalo.control.e$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public int f42791a;

        /* renamed from: b */
        public long f42792b;

        /* renamed from: c */
        public String f42793c;

        /* renamed from: d */
        public int f42794d;

        /* renamed from: e */
        public int f42795e;

        /* renamed from: f */
        public String f42796f;

        /* renamed from: g */
        public String f42797g;

        /* renamed from: h */
        public boolean f42798h;

        /* renamed from: i */
        public int f42799i;

        /* renamed from: j */
        public int f42800j;

        public a() {
            this.f42798h = false;
            this.f42791a = 0;
        }

        /* renamed from: a */
        public void m40863a() {
            this.f42799i = this.f42795e;
            this.f42800j = this.f42794d;
        }

        /* renamed from: b */
        public int m40864b() {
            return this.f42794d;
        }

        /* renamed from: c */
        public int m40865c() {
            return this.f42795e;
        }

        /* renamed from: d */
        public long m40866d() {
            return this.f42792b;
        }

        /* renamed from: e */
        public void m40867e() {
            this.f42795e = this.f42799i;
            this.f42794d = this.f42800j;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f42791a == aVar.f42791a && this.f42792b == aVar.m40866d() && this.f42794d == aVar.f42794d && this.f42795e == aVar.f42795e) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public void m40868f(int i11, long j11, int i12, int i13) {
            this.f42791a = i11;
            this.f42792b = j11;
            this.f42795e = i12;
            this.f42794d = i13;
            m40863a();
        }

        /* renamed from: g */
        public void m40869g(long j11, int i11, int i12) {
            this.f42792b = j11;
            this.f42795e = i11;
            this.f42794d = i12;
            m40863a();
        }

        /* renamed from: h */
        public JSONObject m40870h() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uid", this.f42792b);
                if (!TextUtils.isEmpty(this.f42793c)) {
                    jSONObject.put("gUid", this.f42793c);
                }
                jSONObject.put("pos", this.f42795e);
                jSONObject.put("len", this.f42794d);
                jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f42791a);
                jSONObject.put("ignoreNickname", this.f42798h ? 1 : 0);
                return jSONObject;
            } catch (Exception e11) {
                e11.printStackTrace();
                return new JSONObject();
            }
        }

        public a(long j11, int i11, int i12) {
            this(0, j11, i11, i12);
        }

        public a(long j11, int i11, int i12, boolean z11) {
            this(0, j11, i11, i12);
            this.f42798h = z11;
            m40863a();
        }

        public a(int i11, long j11, int i12, int i13) {
            this.f42798h = false;
            this.f42791a = i11;
            this.f42792b = j11;
            this.f42795e = i12;
            this.f42794d = i13;
            m40863a();
        }

        public a(int i11, int i12) {
            this.f42798h = false;
            this.f42791a = 0;
            this.f42795e = i11;
            this.f42794d = i12;
            m40863a();
        }

        public a(JSONObject jSONObject) {
            this.f42798h = false;
            try {
                this.f42791a = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                this.f42792b = jSONObject.optLong("uid");
                this.f42793c = jSONObject.optString("gUid");
                this.f42795e = jSONObject.optInt("pos");
                this.f42794d = jSONObject.optInt("len");
                this.f42798h = jSONObject.optInt("ignoreNickname", 0) == 1;
                m40863a();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C7907e() {
        this.f42788a = new ArrayList();
        this.f42789b = true;
        this.f42790c = true;
    }

    /* renamed from: k */
    public static /* synthetic */ int m40851k(a aVar, a aVar2) {
        int i11 = aVar.f42795e;
        int i12 = aVar2.f42795e;
        if (i11 == i12) {
            return 0;
        }
        if (i11 < i12) {
            return -1;
        }
        return 1;
    }

    /* renamed from: b */
    public void m40852b(a aVar) {
        synchronized (this.f42788a) {
            this.f42788a.add(aVar);
        }
    }

    /* renamed from: c */
    public boolean m40853c() {
        boolean z11 = true;
        boolean z12 = false;
        for (a aVar : this.f42788a) {
            if (aVar.f42791a == 0 && aVar.f42792b <= 0 && !TextUtils.isEmpty(aVar.f42793c)) {
                if (!TextUtils.isEmpty(C31943h5.f146766a.m153507i(aVar.f42793c, this.f42790c))) {
                    aVar.f42792b = Integer.parseInt(r4);
                } else {
                    z11 = false;
                }
                z12 = true;
            }
        }
        this.f42790c = false;
        this.f42789b = !z11;
        if (!z12 || !z11) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public Pair m40854d() {
        boolean z11 = true;
        boolean z12 = false;
        for (a aVar : this.f42788a) {
            if (aVar.f42791a == 0 && aVar.f42792b > 0 && TextUtils.isEmpty(aVar.f42793c)) {
                String m153509l = C31943h5.f146766a.m153509l(aVar.f42792b + "", true);
                if (!TextUtils.isEmpty(m153509l)) {
                    aVar.f42793c = m153509l;
                } else {
                    z11 = false;
                }
                z12 = true;
            }
        }
        return new Pair(Boolean.valueOf(z11), Boolean.valueOf(z12));
    }

    /* renamed from: e */
    public a m40855e(int i11) {
        synchronized (this.f42788a) {
            try {
                if (this.f42788a.size() != 0 && i11 >= 0 && i11 < this.f42788a.size()) {
                    return (a) this.f42788a.get(i11);
                }
                return null;
            } finally {
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7907e)) {
            return false;
        }
        C7907e c7907e = (C7907e) obj;
        synchronized (this.f42788a) {
            try {
                if (this.f42788a == c7907e.m40856f()) {
                    return true;
                }
                if (this.f42788a.size() != c7907e.m40856f().size()) {
                    return false;
                }
                int size = this.f42788a.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (!((a) this.f42788a.get(i11)).equals(c7907e.m40856f().get(i11))) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public List m40856f() {
        ArrayList arrayList;
        synchronized (this.f42788a) {
            arrayList = new ArrayList(this.f42788a);
        }
        return arrayList;
    }

    /* renamed from: g */
    public List m40857g() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f42788a.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(((a) it.next()).m40870h()));
        }
        Collections.sort(arrayList, new Comparator() { // from class: zh.d7
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m40851k;
                m40851k = C7907e.m40851k((C7907e.a) obj, (C7907e.a) obj2);
                return m40851k;
            }
        });
        return arrayList;
    }

    /* renamed from: h */
    public boolean m40858h() {
        try {
            synchronized (this.f42788a) {
                try {
                    Iterator it = this.f42788a.iterator();
                    while (it.hasNext()) {
                        if (((a) it.next()).f42791a == 0) {
                            return true;
                        }
                    }
                    return false;
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: i */
    public boolean m40859i() {
        try {
            synchronized (this.f42788a) {
                try {
                    Iterator it = this.f42788a.iterator();
                    while (it.hasNext()) {
                        if (((a) it.next()).f42791a == 1) {
                            return true;
                        }
                    }
                    return false;
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: j */
    public boolean m40860j() {
        try {
            long parseLong = Long.parseLong(CoreUtility.f89233i);
            synchronized (this.f42788a) {
                try {
                    Iterator it = this.f42788a.iterator();
                    while (it.hasNext()) {
                        if (((a) it.next()).f42792b == parseLong) {
                            return true;
                        }
                    }
                    return false;
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: l */
    public int m40861l() {
        int size;
        synchronized (this.f42788a) {
            size = this.f42788a.size();
        }
        return size;
    }

    /* renamed from: m */
    public JSONArray m40862m() {
        JSONArray jSONArray = new JSONArray();
        for (int i11 = 0; i11 < this.f42788a.size(); i11++) {
            jSONArray.put(((a) this.f42788a.get(i11)).m40870h());
        }
        return jSONArray;
    }

    public C7907e(JSONArray jSONArray) {
        this.f42788a = new ArrayList();
        this.f42790c = true;
        try {
            this.f42789b = false;
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                a aVar = new a(jSONArray.getJSONObject(i11));
                this.f42788a.add(aVar);
                if (aVar.f42791a == 0 && aVar.f42792b == 0 && !TextUtils.isEmpty(aVar.f42793c)) {
                    this.f42789b = true;
                }
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }
}
