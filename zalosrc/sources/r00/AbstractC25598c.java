package r00;

import am.AbstractC0924m0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7306b;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import me0.AbstractC23222t7;
import mm0.AbstractC23350e;

/* renamed from: r00.c */
/* loaded from: classes4.dex */
public abstract class AbstractC25598c {
    public static final a Companion = new a(null);

    /* renamed from: r00.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x0027, B:11:0x002f, B:12:0x003c, B:14:0x0049, B:16:0x0053, B:20:0x0058, B:25:0x0037, B:26:0x005c), top: B:2:0x0001, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x0027, B:11:0x002f, B:12:0x003c, B:14:0x0049, B:16:0x0053, B:20:0x0058, B:25:0x0037, B:26:0x005c), top: B:2:0x0001, inners: #0 }] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final boolean m132229a(ImageView imageView, boolean z11) {
            long j11;
            Date parse;
            try {
                C25596a m132219a = C25596a.Companion.m132219a();
                if (!AbstractC0924m0.m3308Oa() && m132219a.m132206d()) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+7:00"));
                    try {
                        parse = simpleDateFormat.parse(AbstractC7306b.f40032b);
                    } catch (ParseException e11) {
                        e11.printStackTrace();
                    }
                    if (parse != null) {
                        j11 = parse.getTime();
                        if (m132219a.m132213l() - j11 <= m132219a.m132212k()) {
                            imageView.setImageResource(AbstractC16803z.ic_icn_reddot_warning);
                            imageView.setVisibility(0);
                            if (z11) {
                                m132230d(imageView);
                                return true;
                            }
                            return true;
                        }
                        imageView.setVisibility(8);
                    }
                    j11 = 0;
                    if (m132219a.m132213l() - j11 <= m132219a.m132212k()) {
                    }
                } else {
                    imageView.setVisibility(8);
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
            return false;
        }

        /* renamed from: d */
        private final void m132230d(ImageView imageView) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int i11 = AbstractC23222t7.f112558f;
            layoutParams2.topMargin = i11;
            layoutParams2.rightMargin = i11;
            imageView.setLayoutParams(layoutParams2);
        }

        /* renamed from: b */
        public final boolean m132231b(ViewGroup viewGroup, int i11) {
            AbstractC19074t.m100208f(viewGroup, "viewContainer");
            ImageView imageView = (ImageView) viewGroup.findViewById(i11);
            if (imageView == null) {
                return false;
            }
            return m132229a(imageView, viewGroup instanceof ActionBarMenuItem);
        }

        /* renamed from: c */
        public final boolean m132232c(ImageView imageView, List list) {
            AbstractC19074t.m100208f(imageView, "badgeWarning");
            AbstractC19074t.m100208f(list, "viewsRedDotExist");
            if (!m132229a(imageView, false)) {
                return false;
            }
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (list.get(i11) != null) {
                    Object obj = list.get(i11);
                    AbstractC19074t.m100205c(obj);
                    ((View) obj).setVisibility(8);
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static final boolean m132227a(ViewGroup viewGroup, int i11) {
        return Companion.m132231b(viewGroup, i11);
    }

    /* renamed from: b */
    public static final boolean m132228b(ImageView imageView, List list) {
        return Companion.m132232c(imageView, list);
    }
}
