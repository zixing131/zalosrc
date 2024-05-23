package no;

import android.content.Intent;
import java.util.ArrayList;

/* renamed from: no.g */
/* loaded from: classes4.dex */
public class C23914g {

    /* renamed from: a */
    public ArrayList f115572a;

    /* renamed from: b */
    public boolean f115573b;

    /* renamed from: c */
    public boolean f115574c;

    private C23914g(ArrayList arrayList, boolean z11, boolean z12) {
        this.f115572a = arrayList;
        this.f115573b = z11;
        this.f115574c = z12;
    }

    /* renamed from: a */
    public static C23914g m125041a(Intent intent) {
        if (intent == null) {
            return null;
        }
        boolean booleanExtra = intent.getBooleanExtra("extra_feed_not_exist", false);
        return new C23914g(intent.getStringArrayListExtra("extra_remove_tag_uids"), intent.getBooleanExtra("extra_feed_has_no_tags", false), booleanExtra);
    }
}
