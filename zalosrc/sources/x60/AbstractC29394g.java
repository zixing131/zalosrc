package x60;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import java.util.ArrayList;
import java.util.HashMap;
import x60.AbstractC29394g;

/* renamed from: x60.g */
/* loaded from: classes5.dex */
public abstract class AbstractC29394g {

    /* renamed from: x60.g$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo57176a();

        /* renamed from: b */
        void mo57177b(int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ boolean m146562g(Context context, View view, Object obj, String str) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(context.getResources().getDrawable(((Integer) obj).intValue()));
            return true;
        }
        if ((view instanceof RobotoTextView) && (obj instanceof Boolean)) {
            ((RobotoTextView) view).setTextStyleBold(((Boolean) obj).booleanValue());
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m146563h(a aVar, InterfaceC17463d interfaceC17463d) {
        if (aVar != null) {
            aVar.mo57176a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m146564i(a aVar, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (aVar != null) {
            aVar.mo57177b(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ boolean m146565j(Context context, View view, Object obj, String str) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(context.getResources().getDrawable(((Integer) obj).intValue()));
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m146566k(a aVar, InterfaceC17463d interfaceC17463d) {
        if (aVar != null) {
            aVar.mo57176a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m146567l(a aVar, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (aVar != null) {
            aVar.mo57177b(i11);
        }
    }

    /* renamed from: m */
    public static KeyEventCallbackC17462c m146568m(Context context, String[] strArr, int i11, String str, a aVar) {
        return m146569n(context, strArr, i11, str, aVar, 2);
    }

    /* renamed from: n */
    public static KeyEventCallbackC17462c m146569n(final Context context, String[] strArr, int i11, String str, final a aVar, int i12) {
        int i13;
        try {
            int length = strArr.length;
            if (i11 > length - 1) {
                i11 = 0;
            }
            int[] iArr = new int[length];
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < length; i14++) {
                if (i14 != i11) {
                    i13 = AbstractC16803z.btn_radio_off_holo_light;
                } else {
                    i13 = AbstractC16803z.btn_radio_on_holo_light;
                }
                iArr[i14] = i13;
                HashMap hashMap = new HashMap();
                hashMap.put("name", strArr[i14]);
                hashMap.put("icon", Integer.valueOf(iArr[i14]));
                arrayList.add(hashMap);
            }
            SimpleAdapter simpleAdapter = new SimpleAdapter(context, arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name", "icon"}, new int[]{AbstractC6918a0.tv_active_time_passcode, AbstractC6918a0.ic_choose_or_not});
            simpleAdapter.setViewBinder(new SimpleAdapter.ViewBinder() { // from class: x60.d
                @Override // android.widget.SimpleAdapter.ViewBinder
                public final boolean setViewValue(View view, Object obj, String str2) {
                    boolean m146565j;
                    m146565j = AbstractC29394g.m146565j(context, view, obj, str2);
                    return m146565j;
                }
            });
            C8009j.a aVar2 = new C8009j.a(context);
            if (str != null && str.length() > 0) {
                aVar2.m43172u(str);
                aVar2.m43173v(i12);
            }
            aVar2.m43155d(true);
            aVar2.m43167p(new InterfaceC17463d.c() { // from class: x60.e
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                /* renamed from: p7 */
                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                    AbstractC29394g.m146566k(AbstractC29394g.a.this, interfaceC17463d);
                }
            });
            aVar2.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: x60.f
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i15) {
                    AbstractC29394g.m146567l(AbstractC29394g.a.this, interfaceC17463d, i15);
                }
            });
            C8009j m43152a = aVar2.m43152a();
            if (m43152a != null && !m43152a.m92868m()) {
                m43152a.mo13822K();
            }
            return m43152a;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: o */
    public static KeyEventCallbackC17462c m146570o(final Context context, String[] strArr, int[] iArr, int i11, String str, final a aVar, int i12) {
        int[] iArr2;
        int i13;
        boolean z11;
        try {
            int length = strArr.length;
            int i14 = i11;
            if (i14 > length - 1) {
                i14 = 0;
            }
            int[] iArr3 = new int[length];
            ArrayList arrayList = new ArrayList();
            char c11 = 1;
            if (iArr == null) {
                iArr2 = new int[]{AbstractC16803z.btn_radio_off_holo_light, AbstractC16803z.btn_radio_on_holo_light};
            } else {
                iArr2 = iArr;
            }
            int i15 = 0;
            while (i15 < length) {
                if (i15 != i14) {
                    i13 = iArr2[0];
                } else {
                    i13 = iArr2[c11];
                }
                iArr3[i15] = i13;
                HashMap hashMap = new HashMap();
                hashMap.put("name", strArr[i15]);
                hashMap.put("icon", Integer.valueOf(iArr3[i15]));
                if (i15 == i14) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                hashMap.put("isSelected", Boolean.valueOf(z11));
                arrayList.add(hashMap);
                i15++;
                c11 = 1;
            }
            int i16 = AbstractC6918a0.tv_active_time_passcode;
            SimpleAdapter simpleAdapter = new SimpleAdapter(context, arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name", "icon", "isSelected"}, new int[]{i16, AbstractC6918a0.ic_choose_or_not, i16});
            simpleAdapter.setViewBinder(new SimpleAdapter.ViewBinder() { // from class: x60.a
                @Override // android.widget.SimpleAdapter.ViewBinder
                public final boolean setViewValue(View view, Object obj, String str2) {
                    boolean m146562g;
                    m146562g = AbstractC29394g.m146562g(context, view, obj, str2);
                    return m146562g;
                }
            });
            C8009j.a aVar2 = new C8009j.a(context);
            if (str != null && str.length() > 0) {
                aVar2.m43172u(str);
                aVar2.m43173v(i12);
            }
            aVar2.m43155d(true);
            aVar2.m43167p(new InterfaceC17463d.c() { // from class: x60.b
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                /* renamed from: p7 */
                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                    AbstractC29394g.m146563h(AbstractC29394g.a.this, interfaceC17463d);
                }
            });
            aVar2.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: x60.c
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i17) {
                    AbstractC29394g.m146564i(AbstractC29394g.a.this, interfaceC17463d, i17);
                }
            });
            C8009j m43152a = aVar2.m43152a();
            if (m43152a != null && !m43152a.m92868m()) {
                m43152a.mo13822K();
            }
            return m43152a;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }
}
