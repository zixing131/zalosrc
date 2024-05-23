package v50;

import android.os.Bundle;
import com.zing.zalo.data.entity.chat.conversation.FirstUnreadMsg;
import java.util.ArrayList;
import p205hc.InterfaceC19968g;
import p620wt.AbstractC29227b;

/* renamed from: v50.hd */
/* loaded from: classes5.dex */
public class C27675hd implements InterfaceC19968g {

    /* renamed from: j */
    public ArrayList f129716j;

    /* renamed from: k */
    public FirstUnreadMsg f129717k;

    /* renamed from: a */
    public int f129707a = 0;

    /* renamed from: b */
    public boolean f129708b = true;

    /* renamed from: c */
    public boolean f129709c = false;

    /* renamed from: d */
    public String f129710d = null;

    /* renamed from: e */
    public String f129711e = null;

    /* renamed from: f */
    public String f129712f = null;

    /* renamed from: g */
    public boolean f129713g = false;

    /* renamed from: h */
    public long f129714h = 0;

    /* renamed from: i */
    public boolean f129715i = false;

    /* renamed from: l */
    public boolean f129718l = true;

    /* renamed from: a */
    public static C27675hd m140768a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        C27675hd c27675hd = new C27675hd();
        c27675hd.f129707a = bundle.getInt("currentStateInput", 0);
        c27675hd.f129708b = bundle.getBoolean("needCheckAppPermission", true);
        c27675hd.f129709c = bundle.getBoolean("restoreCameraListener", false);
        c27675hd.f129710d = bundle.getString("fileRecordName", null);
        c27675hd.f129711e = bundle.getString("saved_request_location_uid", null);
        c27675hd.f129712f = bundle.getString("saved_request_location_params", null);
        c27675hd.f129713g = bundle.getBoolean("isAutoOpenFile", false);
        c27675hd.f129714h = bundle.getLong("timeStartAutoOpenFile", 0L);
        boolean z11 = bundle.getBoolean("isInMultiSelectionMode", false);
        c27675hd.f129715i = z11;
        if (z11) {
            c27675hd.f129716j = bundle.getParcelableArrayList("selectedMessageIds");
        }
        c27675hd.f129717k = (FirstUnreadMsg) bundle.getParcelable("first_unread_jump");
        c27675hd.f129718l = bundle.getBoolean("has_more_group_cloud_msg", true);
        return c27675hd;
    }

    /* renamed from: b */
    public static void m140769b(Bundle bundle, C27675hd c27675hd) {
        if (c27675hd == null) {
            return;
        }
        AbstractC29227b.m145978a(bundle, "currentStateInput", Integer.valueOf(c27675hd.f129707a), 0);
        Boolean valueOf = Boolean.valueOf(c27675hd.f129708b);
        Boolean bool = Boolean.TRUE;
        AbstractC29227b.m145978a(bundle, "needCheckAppPermission", valueOf, bool);
        Boolean valueOf2 = Boolean.valueOf(c27675hd.f129709c);
        Boolean bool2 = Boolean.FALSE;
        AbstractC29227b.m145978a(bundle, "restoreCameraListener", valueOf2, bool2);
        AbstractC29227b.m145979b(bundle, "fileRecordName", c27675hd.f129710d);
        AbstractC29227b.m145979b(bundle, "saved_request_location_uid", c27675hd.f129711e);
        AbstractC29227b.m145979b(bundle, "saved_request_location_params", c27675hd.f129712f);
        AbstractC29227b.m145978a(bundle, "isAutoOpenFile", Boolean.valueOf(c27675hd.f129713g), bool2);
        AbstractC29227b.m145978a(bundle, "timeStartAutoOpenFile", Long.valueOf(c27675hd.f129714h), 0L);
        if (c27675hd.f129715i) {
            bundle.putBoolean("isInMultiSelectionMode", true);
            bundle.putParcelableArrayList("selectedMessageIds", c27675hd.f129716j);
        }
        AbstractC29227b.m145980c(bundle, "first_unread_jump", c27675hd.f129717k);
        AbstractC29227b.m145978a(bundle, "has_more_group_cloud_msg", Boolean.valueOf(c27675hd.f129718l), bool);
    }
}
