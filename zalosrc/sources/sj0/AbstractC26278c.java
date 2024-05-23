package sj0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: sj0.c */
/* loaded from: classes7.dex */
public abstract class AbstractC26278c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sj0.c$a */
    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a */
        int f124760a;

        /* renamed from: b */
        int f124761b;

        a() {
        }
    }

    /* renamed from: sj0.c$b */
    /* loaded from: classes7.dex */
    static class b {

        /* renamed from: a */
        List f124762a;

        /* renamed from: b */
        List f124763b;

        b() {
        }
    }

    /* renamed from: a */
    public static NinePatchDrawable m135215a(Resources resources, Bitmap bitmap, b bVar, int i11) {
        try {
            ByteBuffer m135217c = m135217c(bVar.f124762a, bVar.f124763b, i11);
            byte[] array = m135217c.array();
            boolean isNinePatchChunk = NinePatch.isNinePatchChunk(array);
            m135217c.clear();
            if (isNinePatchChunk) {
                return new NinePatchDrawable(resources, bitmap, array, new Rect(), "Zinstant");
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static int m135216b(int i11, int i12, b bVar) {
        int size = bVar.f124762a.size() * 2;
        int i13 = size + 1;
        int size2 = bVar.f124763b.size() * 2;
        int i14 = size2 + 1;
        if (((a) bVar.f124762a.get(0)).f124760a != 0) {
            size = i13;
        }
        if (((a) bVar.f124762a.get(r1.size() - 1)).f124761b == i11 - 2) {
            size--;
        }
        if (((a) bVar.f124763b.get(0)).f124760a != 0) {
            size2 = i14;
        }
        if (((a) bVar.f124763b.get(r6.size() - 1)).f124761b == i12 - 2) {
            size2--;
        }
        return size * size2;
    }

    /* renamed from: c */
    private static ByteBuffer m135217c(List list, List list2, int i11) {
        ByteBuffer order = ByteBuffer.allocate((list.size() * 8) + 32 + (list2.size() * 8) + (i11 * 4)).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) (list.size() * 2));
        order.put((byte) (list2.size() * 2));
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            order.putInt(aVar.f124760a);
            order.putInt(aVar.f124761b);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            a aVar2 = (a) it2.next();
            order.putInt(aVar2.f124760a);
            order.putInt(aVar2.f124761b);
        }
        for (int i12 = 0; i12 < i11; i12++) {
            order.putInt(1);
        }
        return order;
    }

    /* renamed from: d */
    public static b m135218d(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        ArrayList arrayList = new ArrayList();
        int i11 = -1;
        for (int i12 = 1; i12 < width - 1; i12++) {
            int pixel = bitmap.getPixel(i12, 0);
            int alpha = Color.alpha(pixel);
            int red = Color.red(pixel);
            int green = Color.green(pixel);
            int blue = Color.blue(pixel);
            if (alpha == 255 && red == 0 && green == 0 && blue == 0) {
                if (i11 == -1) {
                    i11 = i12 - 1;
                }
            } else if (i11 != -1) {
                a aVar = new a();
                aVar.f124760a = i11;
                aVar.f124761b = i12 - 1;
                arrayList.add(aVar);
                i11 = -1;
            }
        }
        if (i11 != -1) {
            a aVar2 = new a();
            aVar2.f124760a = i11;
            aVar2.f124761b = width - 2;
            arrayList.add(aVar2);
        }
        ArrayList arrayList2 = new ArrayList();
        int i13 = -1;
        for (int i14 = 1; i14 < height - 1; i14++) {
            int pixel2 = bitmap.getPixel(0, i14);
            int alpha2 = Color.alpha(pixel2);
            int red2 = Color.red(pixel2);
            int green2 = Color.green(pixel2);
            int blue2 = Color.blue(pixel2);
            if (alpha2 == 255 && red2 == 0 && green2 == 0 && blue2 == 0) {
                if (i13 == -1) {
                    i13 = i14 - 1;
                }
            } else if (i13 != -1) {
                a aVar3 = new a();
                aVar3.f124760a = i13;
                aVar3.f124761b = i14 - 1;
                arrayList2.add(aVar3);
                i13 = -1;
            }
        }
        if (i13 != -1) {
            a aVar4 = new a();
            aVar4.f124760a = i13;
            aVar4.f124761b = height - 2;
            arrayList2.add(aVar4);
        }
        b bVar = new b();
        bVar.f124762a = arrayList;
        bVar.f124763b = arrayList2;
        return bVar;
    }

    /* renamed from: e */
    public static Bitmap m135219e(Bitmap bitmap, int i11) {
        int i12 = i11 * 2;
        return Bitmap.createBitmap(bitmap, i11, i11, bitmap.getWidth() - i12, bitmap.getHeight() - i12);
    }
}
