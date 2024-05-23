package com.google.android.gms.measurement.internal;

import am.C0925n;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC4205o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p227i3.AbstractC20216t;
import p227i3.C20215s;
import p227i3.C20218v;

/* renamed from: com.google.android.gms.measurement.internal.y3 */
/* loaded from: classes.dex */
public final class C6192y3 {

    /* renamed from: a */
    private final String f34608a;

    /* renamed from: b */
    private final Bundle f34609b;

    /* renamed from: c */
    private Bundle f34610c;

    /* renamed from: d */
    final /* synthetic */ C5950c4 f34611d;

    public C6192y3(C5950c4 c5950c4, String str, Bundle bundle) {
        this.f34611d = c5950c4;
        AbstractC4205o.m19718g("default_event_parameters");
        this.f34608a = "default_event_parameters";
        this.f34609b = new Bundle();
    }

    /* renamed from: a */
    public final Bundle m31497a() {
        char c11;
        if (this.f34610c == null) {
            String string = this.f34611d.m30817n().getString(this.f34608a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i11);
                            String string2 = jSONObject.getString(C0925n.f3421p);
                            String string3 = jSONObject.getString(AbstractC20216t.f99969a);
                            int hashCode = string3.hashCode();
                            if (hashCode != 100) {
                                if (hashCode != 108) {
                                    if (hashCode == 115 && string3.equals(C20215s.f99966b)) {
                                        c11 = 0;
                                    }
                                    c11 = 65535;
                                } else {
                                    if (string3.equals("l")) {
                                        c11 = 2;
                                    }
                                    c11 = 65535;
                                }
                            } else {
                                if (string3.equals("d")) {
                                    c11 = 1;
                                }
                                c11 = 65535;
                            }
                            if (c11 != 0) {
                                if (c11 != 1) {
                                    if (c11 != 2) {
                                        this.f34611d.f34158a.mo31033c().m31197q().m31109b("Unrecognized persisted bundle type. Type", string3);
                                    } else {
                                        bundle.putLong(string2, Long.parseLong(jSONObject.getString(C20218v.f100059b)));
                                    }
                                } else {
                                    bundle.putDouble(string2, Double.parseDouble(jSONObject.getString(C20218v.f100059b)));
                                }
                            } else {
                                bundle.putString(string2, jSONObject.getString(C20218v.f100059b));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f34611d.f34158a.mo31033c().m31197q().m31108a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f34610c = bundle;
                } catch (JSONException unused2) {
                    this.f34611d.f34158a.mo31033c().m31197q().m31108a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f34610c == null) {
                this.f34610c = this.f34609b;
            }
        }
        return this.f34610c;
    }

    /* renamed from: b */
    public final void m31498b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f34611d.m30817n().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f34608a);
        } else {
            String str = this.f34608a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(C0925n.f3421p, str2);
                        jSONObject.put(C20218v.f100059b, obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put(AbstractC20216t.f99969a, C20215s.f99966b);
                        } else if (obj instanceof Long) {
                            jSONObject.put(AbstractC20216t.f99969a, "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put(AbstractC20216t.f99969a, "d");
                        } else {
                            this.f34611d.f34158a.mo31033c().m31197q().m31109b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e11) {
                        this.f34611d.f34158a.mo31033c().m31197q().m31109b("Cannot serialize bundle value to SharedPreferences", e11);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f34610c = bundle;
    }
}
