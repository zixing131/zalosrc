package p084cs;

import android.content.Context;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import fn0.AbstractC19074t;

/* renamed from: cs.d */
/* loaded from: classes4.dex */
public final class C17570d {

    /* renamed from: a */
    private final Context f89503a;

    public C17570d(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f89503a = context;
    }

    /* renamed from: a */
    public final String m93560a() {
        String string = this.f89503a.getString(AbstractC8020f0.str_reaction_only_you);
        AbstractC19074t.m100207e(string, "getString(...)");
        return string;
    }

    /* renamed from: b */
    public final String m93561b(String str, int i11) {
        AbstractC19074t.m100208f(str, "aliasName");
        int i12 = i11 - 1;
        String quantityString = this.f89503a.getResources().getQuantityString(AbstractC7921d0.str_reaction_someone_with_others, i12, str, Integer.valueOf(i12));
        AbstractC19074t.m100207e(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    /* renamed from: c */
    public final String m93562c(int i11) {
        return String.valueOf(i11);
    }

    /* renamed from: d */
    public final String m93563d(int i11) {
        String quantityString = this.f89503a.getResources().getQuantityString(AbstractC7921d0.str_reaction_total_friends, i11, Integer.valueOf(i11));
        AbstractC19074t.m100207e(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    /* renamed from: e */
    public final String m93564e(int i11) {
        int i12 = i11 - 1;
        String quantityString = this.f89503a.getResources().getQuantityString(AbstractC7921d0.str_reaction_you_and_people_overflow, i12, Integer.valueOf(i12));
        AbstractC19074t.m100207e(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    /* renamed from: f */
    public final String m93565f(String str, int i11) {
        AbstractC19074t.m100208f(str, "aliasName");
        int i12 = i11 - 2;
        String quantityString = this.f89503a.getResources().getQuantityString(AbstractC7921d0.str_reaction_you_someone_with_others, i12, str, Integer.valueOf(i12));
        AbstractC19074t.m100207e(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    /* renamed from: g */
    public final String m93566g(int i11) {
        int i12 = i11 - 1;
        String quantityString = this.f89503a.getResources().getQuantityString(AbstractC7921d0.str_reaction_you_with_others, i12, Integer.valueOf(i12));
        AbstractC19074t.m100207e(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    /* renamed from: h */
    public final String m93567h(String str) {
        AbstractC19074t.m100208f(str, "aliasName");
        String string = this.f89503a.getString(AbstractC8020f0.str_reaction_you_with_someone, str);
        AbstractC19074t.m100207e(string, "getString(...)");
        return string;
    }
}
