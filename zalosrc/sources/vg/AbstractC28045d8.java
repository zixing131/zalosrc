package vg;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p471r3.EnumC25629a;

/* renamed from: vg.d8 */
/* loaded from: classes3.dex */
public abstract class AbstractC28045d8 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.d8$a */
    /* loaded from: classes3.dex */
    public class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f130907l1;

        /* renamed from: m1 */
        final /* synthetic */ RecyclingImageView f130908m1;

        /* renamed from: n1 */
        final /* synthetic */ int f130909n1;

        a(String str, RecyclingImageView recyclingImageView, int i11) {
            this.f130907l1 = str;
            this.f130908m1 = recyclingImageView;
            this.f130909n1 = i11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (TextUtils.equals(this.f130907l1, str) && c3979l != null && c3979l.m18849m() && c3979l.m18839c().getWidth() > 0 && c3979l.m18839c().getHeight() > 0) {
                this.f130908m1.setImageInfo(c3979l);
            } else if (this.f130909n1 != 0) {
                RecyclingImageView recyclingImageView = this.f130908m1;
                recyclingImageView.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView.getContext(), this.f130909n1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.d8$b */
    /* loaded from: classes3.dex */
    public class b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f130910l1;

        /* renamed from: m1 */
        final /* synthetic */ ImageView f130911m1;

        /* renamed from: n1 */
        final /* synthetic */ int f130912n1;

        /* renamed from: o1 */
        final /* synthetic */ int f130913o1;

        b(String str, ImageView imageView, int i11, int i12) {
            this.f130910l1 = str;
            this.f130911m1 = imageView;
            this.f130912n1 = i11;
            this.f130913o1 = i12;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (TextUtils.equals(this.f130910l1, str) && c3979l != null && c3979l.m18849m() && c3979l.m18839c().getWidth() > 0 && c3979l.m18839c().getHeight() > 0) {
                Resources resources = this.f130911m1.getResources();
                Bitmap m18839c = c3979l.m18839c();
                int i11 = this.f130912n1;
                this.f130911m1.setImageDrawable(new BitmapDrawable(resources, Bitmap.createScaledBitmap(m18839c, i11, i11, true)));
                return;
            }
            if (this.f130913o1 != 0) {
                ImageView imageView = this.f130911m1;
                imageView.setImageDrawable(AbstractC23136l9.m118665N(imageView.getContext(), this.f130913o1));
            }
        }
    }

    /* renamed from: a */
    public static void m141480a(RecyclingImageView recyclingImageView, C28212v6 c28212v6, C23528a c23528a, int i11) {
        if (recyclingImageView != null && c23528a != null) {
            if (c28212v6 != null && c28212v6.m142167f()) {
                String str = c28212v6.f131585k;
                if (!TextUtils.isEmpty(str)) {
                    C24003n c24003n = new C24003n();
                    c24003n.f116275p = true;
                    c24003n.f116276q = true;
                    c24003n.f116260a = AbstractC23136l9.m118742r(24.0f);
                    c24003n.f116266g = EnumC25629a.DEFAULT;
                    ((C23528a) c23528a.m123612r(recyclingImageView)).m123579C(str, c24003n, new a(str, recyclingImageView, i11));
                    return;
                }
                if (i11 != 0) {
                    recyclingImageView.setImageResource(i11);
                    return;
                }
                return;
            }
            if (i11 != 0) {
                recyclingImageView.setImageResource(i11);
            }
        }
    }

    /* renamed from: b */
    public static void m141481b(ImageView imageView, C28212v6 c28212v6, C23528a c23528a, int i11) {
        if (imageView != null && c23528a != null) {
            if (c28212v6 != null && c28212v6.m142167f()) {
                String str = c28212v6.f131585k;
                if (!TextUtils.isEmpty(str)) {
                    int m118742r = AbstractC23136l9.m118742r(24.0f);
                    C24003n c24003n = new C24003n();
                    c24003n.f116275p = true;
                    c24003n.f116276q = true;
                    c24003n.f116260a = m118742r;
                    c24003n.f116266g = EnumC25629a.DEFAULT;
                    ((C23528a) c23528a.m123612r(new C3977j(imageView.getContext()))).m123579C(str, c24003n, new b(str, imageView, m118742r, i11));
                    return;
                }
                if (i11 != 0) {
                    imageView.setImageResource(i11);
                    return;
                }
                return;
            }
            if (i11 != 0) {
                imageView.setImageResource(i11);
            }
        }
    }

    /* renamed from: c */
    public static void m141482c(RecyclingImageView recyclingImageView, C28212v6 c28212v6, C23528a c23528a, Drawable drawable) {
        if (recyclingImageView != null && c23528a != null) {
            if (c28212v6 != null && c28212v6.m142167f()) {
                String str = c28212v6.f131585k;
                if (!TextUtils.isEmpty(str)) {
                    ((C23528a) c23528a.m123612r(recyclingImageView)).m123618x(str, C23278z2.m120151r0(drawable));
                    return;
                } else {
                    m141483d(recyclingImageView, drawable);
                    return;
                }
            }
            m141483d(recyclingImageView, drawable);
        }
    }

    /* renamed from: d */
    private static void m141483d(RecyclingImageView recyclingImageView, Drawable drawable) {
        if (drawable != null) {
            recyclingImageView.setImageDrawable(drawable);
        }
    }
}
