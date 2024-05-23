package bn;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;

/* renamed from: bn.i1 */
/* loaded from: classes3.dex */
public class C2880i1 {

    /* renamed from: a */
    public Drawable f11472a;

    /* renamed from: b */
    public String f11473b;

    /* renamed from: c */
    public int f11474c;

    public C2880i1(Drawable drawable, String str, int i11) {
        this.f11472a = drawable;
        this.f11473b = str;
        this.f11474c = i11;
    }

    /* renamed from: a */
    public static List m13833a(Context context, boolean z11, boolean z12) {
        ArrayList arrayList = new ArrayList();
        if (z11) {
            arrayList.add(new C2880i1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_popup_view_full), AbstractC23136l9.m118743r0(AbstractC8020f0.profile_avataralbum), 1));
        }
        arrayList.add(new C2880i1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_popup_select_camera), AbstractC23136l9.m118743r0(AbstractC8020f0.str_takePhoto), 2));
        arrayList.add(new C2880i1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_popup_select_image), AbstractC23136l9.m118743r0(AbstractC8020f0.str_chooseGalary), 3));
        if (z12) {
            arrayList.add(new C2880i1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_popup_reuse_avatar), AbstractC23136l9.m118743r0(AbstractC8020f0.str_reuseavatar), 6));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List m13834b(Context context, boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2880i1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_popup_select_camera), AbstractC23136l9.m118743r0(AbstractC8020f0.str_takePhoto), 2));
        arrayList.add(new C2880i1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_popup_select_image), AbstractC23136l9.m118743r0(AbstractC8020f0.str_chooseGalary), 3));
        if (z11) {
            arrayList.add(new C2880i1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_popup_reuse_avatar), AbstractC23136l9.m118743r0(AbstractC8020f0.str_reuseavatar), 6));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static List m13835c(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2880i1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_popup_view_full), AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_full_profile_cover), 0));
        arrayList.add(new C2880i1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_popup_select_camera), AbstractC23136l9.m118743r0(AbstractC8020f0.str_takePhoto), 4));
        arrayList.add(new C2880i1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_popup_select_image), AbstractC23136l9.m118743r0(AbstractC8020f0.str_chooseGalary), 5));
        return arrayList;
    }

    /* renamed from: d */
    public static List m13836d(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2880i1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_popup_select_camera), AbstractC23136l9.m118743r0(AbstractC8020f0.str_takePhoto), 4));
        arrayList.add(new C2880i1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_popup_select_image), AbstractC23136l9.m118743r0(AbstractC8020f0.str_chooseGalary), 5));
        return arrayList;
    }
}
