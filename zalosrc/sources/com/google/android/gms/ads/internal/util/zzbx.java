package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.iq2;
import com.google.android.gms.internal.ads.v43;
import com.google.android.gms.internal.ads.x53;
import com.google.android.gms.internal.ads.yk0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbx {
    public static Point zza(MotionEvent motionEvent, View view) {
        int[] zzj = zzj(view);
        float rawX = motionEvent.getRawX();
        return new Point(((int) rawX) - zzj[0], ((int) motionEvent.getRawY()) - zzj[1]);
    }

    public static WindowManager.LayoutParams zzb() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21118S6)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject zzc(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, point2.x));
                    jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, point2.y));
                    jSONObject3.put("start_x", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, point.x));
                    jSONObject3.put("start_y", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e11) {
                    yk0.zzh("Error occurred while putting signals into JSON object.", e11);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e12) {
                e = e12;
                jSONObject = jSONObject2;
                yk0.zzh("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e13) {
            e = e13;
        }
    }

    public static JSONObject zzd(Context context, Map map, Map map2, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Map.Entry entry;
        boolean z11;
        JSONObject jSONObject3 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject3;
        }
        int[] zzj = zzj(view);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            View view2 = (View) ((WeakReference) entry2.getValue()).get();
            if (view2 != null) {
                int[] zzj2 = zzj(view2);
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                Iterator it2 = it;
                try {
                    JSONObject jSONObject6 = jSONObject3;
                    try {
                        jSONObject5.put("width", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, view2.getMeasuredWidth()));
                        jSONObject5.put("height", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, view2.getMeasuredHeight()));
                        jSONObject5.put("x", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, zzj2[0] - zzj[0]));
                        jSONObject5.put("y", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, zzj2[1] - zzj[1]));
                        jSONObject5.put("relative_to", "ad_view");
                        jSONObject4.put("frame", jSONObject5);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject2 = zzk(context, rect);
                        } else {
                            jSONObject2 = new JSONObject();
                            jSONObject2.put("width", 0);
                            jSONObject2.put("height", 0);
                            jSONObject2.put("x", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, zzj2[0] - zzj[0]));
                            jSONObject2.put("y", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, zzj2[1] - zzj[1]));
                            jSONObject2.put("relative_to", "ad_view");
                        }
                        jSONObject4.put("visible_bounds", jSONObject2);
                        if (((String) entry2.getKey()).equals("3010")) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21078O6)).booleanValue()) {
                                jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21088P6)).booleanValue()) {
                                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                jSONObject4.put("view_width_layout_type", zzl(layoutParams.width) - 1);
                                jSONObject4.put("view_height_layout_type", zzl(layoutParams.height) - 1);
                            }
                        }
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject4.put("text_color", textView.getCurrentTextColor());
                            entry = entry2;
                            jSONObject4.put("font_size", textView.getTextSize());
                            jSONObject4.put("text", textView.getText());
                        } else {
                            entry = entry2;
                        }
                        if (map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        jSONObject4.put("is_clickable", z11);
                        jSONObject = jSONObject6;
                    } catch (JSONException unused) {
                        jSONObject = jSONObject6;
                    }
                    try {
                        jSONObject.put((String) entry.getKey(), jSONObject4);
                    } catch (JSONException unused2) {
                        yk0.zzj("Unable to get asset views information");
                        jSONObject3 = jSONObject;
                        it = it2;
                    }
                } catch (JSONException unused3) {
                    jSONObject = jSONObject3;
                }
                jSONObject3 = jSONObject;
                it = it2;
            }
        }
        return jSONObject3;
    }

    public static JSONObject zze(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            jSONObject.put("can_show_on_lock_screen", zzs.zzl(view));
            com.google.android.gms.ads.internal.zzt.zzp();
            jSONObject.put("is_keyguard_locked", zzs.zzz(context));
        } catch (JSONException unused) {
            yk0.zzj("Unable to get lock screen information");
        }
        return jSONObject;
    }

    public static JSONObject zzf(View view) {
        int positionForView;
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            boolean z11 = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21068N6)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzp();
                ViewParent parent = view.getParent();
                while (parent != null && !(parent instanceof ScrollView)) {
                    parent = parent.getParent();
                }
                if (parent == null) {
                    z11 = false;
                }
                jSONObject.put("contained_in_scroll_view", z11);
            } else {
                com.google.android.gms.ads.internal.zzt.zzp();
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                if (parent2 == null) {
                    positionForView = -1;
                } else {
                    positionForView = ((AdapterView) parent2).getPositionForView(view);
                }
                if (positionForView == -1) {
                    z11 = false;
                }
                jSONObject.put("contained_in_scroll_view", z11);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:18|(9:46|47|21|22|23|(3:25|(1:29)|39)(3:40|(1:42)|39)|30|(2:32|(1:34)(1:37))(1:38)|35)|20|21|22|23|(0)(0)|30|(0)(0)|35) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016b, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0177, code lost:            com.google.android.gms.internal.ads.yk0.zzh("Could not log native template signal to JSON", r0);     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0172 A[Catch: JSONException -> 0x016b, TRY_LEAVE, TryCatch #6 {JSONException -> 0x016b, blocks: (B:22:0x013c, B:34:0x0167, B:37:0x016d, B:38:0x0172), top: B:21:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0177 -> B:34:0x017c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject zzg(Context context, View view) {
        String str;
        int hashCode;
        char c11;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view == null) {
            return jSONObject2;
        }
        try {
            int[] zzj = zzj(view);
            int[] iArr = {view.getMeasuredWidth(), view.getMeasuredHeight()};
            for (ViewParent parent = view.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                iArr[0] = Math.min(viewGroup.getMeasuredWidth(), iArr[0]);
                iArr[1] = Math.min(viewGroup.getMeasuredHeight(), iArr[1]);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, view.getMeasuredWidth()));
            jSONObject3.put("height", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, view.getMeasuredHeight()));
            jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, zzj[0]));
            jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, zzj[1]));
            jSONObject3.put("maximum_visible_width", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, iArr[0]));
            jSONObject3.put("maximum_visible_height", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, iArr[1]));
            jSONObject3.put("relative_to", "window");
            jSONObject2.put("frame", jSONObject3);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                jSONObject = zzk(context, rect);
            } else {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("width", 0);
                jSONObject4.put("height", 0);
                jSONObject4.put("x", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, zzj[0]));
                jSONObject4.put("y", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, zzj[1]));
                jSONObject4.put("relative_to", "window");
                jSONObject = jSONObject4;
            }
            jSONObject2.put("visible_bounds", jSONObject);
        } catch (Exception unused) {
            yk0.zzj("Unable to get native ad view bounding box");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21332o5)).booleanValue()) {
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                try {
                    str = (String) parent2.getClass().getMethod("getTemplateTypeName", new Class[0]).invoke(parent2, new Object[0]);
                } catch (IllegalAccessException e11) {
                    e = e11;
                    yk0.zzh("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                    }
                    if (c11 != 0) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21088P6)).booleanValue()) {
                    }
                    return jSONObject2;
                } catch (NoSuchMethodException unused2) {
                } catch (SecurityException e12) {
                    e = e12;
                    yk0.zzh("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                    }
                    if (c11 != 0) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21088P6)).booleanValue()) {
                    }
                    return jSONObject2;
                } catch (InvocationTargetException e13) {
                    e = e13;
                    yk0.zzh("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                    }
                    if (c11 != 0) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21088P6)).booleanValue()) {
                    }
                    return jSONObject2;
                }
                hashCode = str.hashCode();
                if (hashCode != -2066603854) {
                    if (hashCode == 2019754500 && str.equals("medium_template")) {
                        c11 = 1;
                    }
                    c11 = 65535;
                } else {
                    if (str.equals("small_template")) {
                        c11 = 0;
                    }
                    c11 = 65535;
                }
                if (c11 != 0) {
                    if (c11 != 1) {
                        jSONObject2.put("native_template_type", 0);
                    } else {
                        jSONObject2.put("native_template_type", 2);
                    }
                } else {
                    jSONObject2.put("native_template_type", 1);
                }
            }
            str = "";
            hashCode = str.hashCode();
            if (hashCode != -2066603854) {
            }
            if (c11 != 0) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21088P6)).booleanValue()) {
            try {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                jSONObject2.put("view_width_layout_type", zzl(layoutParams.width) - 1);
                jSONObject2.put("view_height_layout_type", zzl(layoutParams.height) - 1);
            } catch (Exception unused3) {
                zze.zza("Unable to get native ad view layout types");
            }
        }
        return jSONObject2;
    }

    public static boolean zzh(Context context, iq2 iq2Var) {
        if (!iq2Var.f22301O) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21098Q6)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21128T6)).booleanValue();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21108R6);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = x53.m27830c(v43.m27166b(';')).m27833d(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean zzi(int i11) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f20994G2)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21004H2)).booleanValue() && i11 > 15299999) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static int[] zzj(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    private static JSONObject zzk(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, rect.right - rect.left));
        jSONObject.put("height", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, rect.bottom - rect.top));
        jSONObject.put("x", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, rect.left));
        jSONObject.put("y", com.google.android.gms.ads.internal.client.zzaw.zzb().m26117d(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int zzl(int i11) {
        if (i11 != -2) {
            return i11 != -1 ? 2 : 3;
        }
        return 4;
    }
}
