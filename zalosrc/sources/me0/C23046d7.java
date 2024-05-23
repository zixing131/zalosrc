package me0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import java.util.Arrays;
import java.util.List;
import qm0.AbstractC25368s;

/* renamed from: me0.d7 */
/* loaded from: classes.dex */
public final class C23046d7 {

    /* renamed from: a */
    public static final C23046d7 f112052a = new C23046d7();

    private C23046d7() {
    }

    /* renamed from: b */
    public static final C16972e0 m118239b(Context context) {
        AbstractC19074t.m100208f(context, "context");
        return f112052a.m118243f(context, AbstractC8020f0.str_sensitive_call_log_block_title, AbstractC8020f0.str_sensitive_call_log_block_desc);
    }

    /* renamed from: c */
    public static final C16972e0 m118240c(Context context) {
        AbstractC19074t.m100208f(context, "context");
        return f112052a.m118243f(context, AbstractC8020f0.str_sensitive_location_block_title, AbstractC8020f0.str_sensitive_location_block_desc);
    }

    /* renamed from: d */
    public static final C16972e0 m118241d(Context context) {
        AbstractC19074t.m100208f(context, "context");
        return f112052a.m118243f(context, AbstractC8020f0.str_sensitive_micro_block_title, AbstractC8020f0.str_sensitive_micro_block_desc);
    }

    /* renamed from: e */
    public static final C16972e0 m118242e(Context context) {
        AbstractC19074t.m100208f(context, "context");
        return f112052a.m118243f(context, AbstractC8020f0.str_sensitive_phonebook_block_title, AbstractC8020f0.str_sensitive_phonebook_block_desc);
    }

    /* renamed from: f */
    private final C16972e0 m118243f(Context context, int i11, int i12) {
        View inflate = LayoutInflater.from(context).inflate(AbstractC7409c0.warning_popup_top_view_yellow, (ViewGroup) null);
        C16972e0.a aVar = new C16972e0.a(context);
        C16972e0.a m90932i = aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        String string = context.getString(i11);
        AbstractC19074t.m100207e(string, "getString(...)");
        C16972e0.a m90918B = m90932i.m90918B(string);
        String string2 = context.getString(i12);
        AbstractC19074t.m100207e(string2, "getString(...)");
        C16972e0.a m90920D = m90918B.m90949z(string2).m90920D(inflate);
        String string3 = context.getString(AbstractC8020f0.str_btn_modal_sensitive);
        AbstractC19074t.m100207e(string3, "getString(...)");
        m90920D.m90943t(string3, new InterfaceC17463d.d() { // from class: me0.c7
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                C23046d7.m118244g(interfaceC17463d, i13);
            }
        });
        C16972e0 m90927d = aVar.m90927d();
        m90927d.m92874z(false);
        return m90927d;
    }

    /* renamed from: g */
    public static final void m118244g(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
    }

    /* renamed from: h */
    public static final C16972e0 m118245h(Context context) {
        AbstractC19074t.m100208f(context, "context");
        return f112052a.m118243f(context, AbstractC8020f0.str_sensitive_wifi_block_title, AbstractC8020f0.str_sensitive_wifi_block_desc);
    }

    /* renamed from: i */
    public static final boolean m118246i(String str) {
        List m131505m;
        List m131505m2;
        AbstractC19074t.m100208f(str, "sourceId");
        m131505m = AbstractC25368s.m131505m("phonebook_scan_via_action_common", "phonebook_auto_scan_on_startup", "phonebook_auto_scan_by_interval", "phonebook_auto_scan_on_login", "phonebook_sync_scan_on_update_profile_info", "phonebook_sync_scan_in_csc", "phonebook_sync_scan_in_main_tab", "phonebook_sync_on_get_server_phonebook_done", "phonebook_auto_scan_by_observer", "phonebook_sync_scan_favorite_contacts", "phonebook_sync_after_scan_device_phonebook", "phonebook_read_contact_on_missed_call", "phonebook_query_photo_for_non_zalo_user", "phonebook_convert_11_scan", "phonebook_convert_11_update");
        m131505m2 = AbstractC25368s.m131505m("phonebook_sync_scan_on_auto_submit", "phonebook_sync_scan_manual_in_setting", "phonebook_sync_scan_in_phonebook_tab");
        if (!m131505m.contains(str) && !m131505m2.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final SensitiveData m118247j(SensitiveData sensitiveData, String str) {
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        if (sensitiveData == null || sensitiveData.m35528c().length() == 0) {
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("Access sensitive %s data without defining sourceId", Arrays.copyOf(new Object[]{str}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            aVar.mo104552e(new Exception(format));
            return new SensitiveData("unknown", "unknown", null, 4, null);
        }
        return sensitiveData;
    }

    /* renamed from: k */
    public static final SensitiveData m118248k(SensitiveData sensitiveData, String str) {
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        if (sensitiveData == null || sensitiveData.m35528c().length() == 0) {
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("Access sensitive %s data without define sourceId", Arrays.copyOf(new Object[]{str}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            aVar.mo104552e(new Exception(format));
            sensitiveData = new SensitiveData("unknown", "unknown", null, 4, null);
        }
        if (C8937j0.m47663l(sensitiveData.m35528c())) {
            return sensitiveData;
        }
        C19067n0 c19067n02 = C19067n0.f94947a;
        String format2 = String.format("SourceId does not have permission to access sensitive %s data", Arrays.copyOf(new Object[]{str}, 1));
        AbstractC19074t.m100207e(format2, "format(...)");
        throw new SensitiveDataException(format2);
    }
}
