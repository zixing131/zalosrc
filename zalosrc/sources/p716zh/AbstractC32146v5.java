package p716zh;

import android.view.View;
import android.view.animation.Animation;
import com.zing.zalo.p077ui.imageviewer.BaseImageViewer;
import com.zing.zalo.p077ui.imageviewer.C12063c;
import com.zing.zalo.p077ui.imageviewer.FeedImageViewer;
import com.zing.zalo.p077ui.imageviewer.FileImageViewer;
import com.zing.zalo.p077ui.imageviewer.GroupAvatarImageViewer;
import com.zing.zalo.p077ui.imageviewer.MainChatImageViewer;
import com.zing.zalo.p077ui.imageviewer.MediaStoreImageViewer;
import com.zing.zalo.p077ui.imageviewer.ProductCatalogImageViewer;
import com.zing.zalo.p077ui.imageviewer.ToolStorageImageViewer;
import com.zing.zalo.report_v2.reportattachment.ReportImageViewer;
import me0.AbstractC23006a0;

/* renamed from: zh.v5 */
/* loaded from: classes3.dex */
public abstract class AbstractC32146v5 {
    /* renamed from: a */
    public static C12063c.f m155118a(String str, int i11) {
        int m117907f;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    m117907f = 0;
                } else {
                    m117907f = AbstractC23006a0.m117876F();
                }
            } else {
                m117907f = AbstractC23006a0.m117875E();
            }
        } else {
            m117907f = AbstractC23006a0.m117907f();
        }
        return new C12063c.f(str, i11, m117907f);
    }

    /* renamed from: b */
    public static void m155119b(View view) {
        if (view != null) {
            view.animate().alpha(1.0f).start();
        }
    }

    /* renamed from: c */
    public static void m155120c(View view) {
        if (view != null) {
            view.animate().alpha(0.0f).start();
        }
    }

    /* renamed from: d */
    public static Class m155121d(int i11) {
        switch (i11) {
            case 2:
                return MainChatImageViewer.class;
            case 3:
                return MediaStoreImageViewer.class;
            case 4:
            case 5:
            case 6:
                return FeedImageViewer.class;
            case 7:
                return FileImageViewer.class;
            case 8:
                return GroupAvatarImageViewer.class;
            case 9:
                return ProductCatalogImageViewer.class;
            case 10:
                return ToolStorageImageViewer.class;
            case 11:
                return ReportImageViewer.class;
            default:
                return BaseImageViewer.class;
        }
    }

    /* renamed from: e */
    public static void m155122e(View view, Animation animation) {
        if (view != null && view.getVisibility() != 8) {
            view.setVisibility(8);
            if (animation != null) {
                view.startAnimation(animation);
            }
        }
    }

    /* renamed from: f */
    public static void m155123f(View view, Animation animation) {
        if (view != null && view.getVisibility() != 0) {
            view.setVisibility(0);
            if (animation != null) {
                view.startAnimation(animation);
            }
        }
    }
}
