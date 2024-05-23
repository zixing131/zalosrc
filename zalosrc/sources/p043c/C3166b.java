package p043c;

import java.util.HashMap;
import java.util.Random;
import p025b.AbstractC2472a;

/* renamed from: c.b */
/* loaded from: classes2.dex */
public final class C3166b implements InterfaceC3165a {

    /* renamed from: d */
    private static C3166b f13384d;

    /* renamed from: a */
    private HashMap f13385a = null;

    /* renamed from: b */
    private HashMap f13386b = null;

    /* renamed from: c */
    private HashMap f13387c = null;

    private C3166b() {
        try {
            new C3176l().m15971a();
            m15952g();
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    private HashMap m15949d(String str) {
        String[] split;
        if (str != null) {
            try {
                if (str.length() != 0 && (split = str.split(";")) != null && split.length != 0) {
                    HashMap hashMap = new HashMap();
                    try {
                        for (String str2 : split) {
                            String[] split2 = str2.split("=");
                            if (split2 != null && split2.length != 0) {
                                try {
                                    hashMap.put(Integer.valueOf(Integer.parseInt(split2[0])), split2[1]);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        return hashMap;
                    } catch (Exception unused2) {
                        return hashMap;
                    }
                }
            } catch (Exception unused3) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public static C3166b m15950e() {
        if (f13384d == null) {
            f13384d = new C3166b();
        }
        return f13384d;
    }

    /* renamed from: f */
    private HashMap m15951f(String str) {
        String[] split;
        if (str != null) {
            try {
                if (str.length() != 0 && (split = str.split(";")) != null && split.length != 0) {
                    HashMap hashMap = new HashMap();
                    try {
                        for (String str2 : split) {
                            String[] split2 = str2.split("=");
                            if (split2 != null && split2.length != 0) {
                                hashMap.put(split2[0], split2[1]);
                            }
                        }
                        return hashMap;
                    } catch (Exception unused) {
                        return hashMap;
                    }
                }
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    /* renamed from: g */
    private void m15952g() {
        try {
            HashMap hashMap = this.f13385a;
            if (hashMap == null || hashMap.size() == 0) {
                this.f13385a = m15949d(AbstractC3177m.f13409i);
            }
            HashMap hashMap2 = this.f13386b;
            if (hashMap2 == null || hashMap2.size() == 0) {
                this.f13386b = m15951f(AbstractC3177m.f13410j);
            }
            HashMap hashMap3 = this.f13387c;
            if (hashMap3 == null || hashMap3.size() == 0) {
                this.f13387c = m15951f(AbstractC3177m.f13411k);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p043c.InterfaceC3165a
    /* renamed from: a */
    public boolean mo15946a() {
        try {
            int i11 = AbstractC2472a.f10077b;
            if (i11 != 0) {
                if (new Random().nextInt(100) < i11) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // p043c.InterfaceC3165a
    /* renamed from: b */
    public String mo15947b(String str, String str2, String str3) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        String str4;
        try {
            String mo15954a = new C3170f().m15958a().mo15954a();
            if (mo15954a != null && mo15954a.length() != 0 && (hashMap = this.f13385a) != null && hashMap.size() != 0 && (hashMap2 = this.f13386b) != null && hashMap2.size() != 0 && (hashMap3 = this.f13387c) != null && hashMap3.size() != 0 && (str4 = (String) this.f13386b.get(mo15954a)) != null && str4.length() != 0) {
                return (String) this.f13387c.get(str4 + "_" + str + "_" + str2 + "_" + str3);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // p043c.InterfaceC3165a
    /* renamed from: c */
    public String mo15948c(int i11) {
        try {
            HashMap hashMap = this.f13385a;
            if (hashMap != null && hashMap.size() != 0) {
                return (String) this.f13385a.get(Integer.valueOf(i11));
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
