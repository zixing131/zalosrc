package p230i6;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* renamed from: i6.w */
/* loaded from: classes.dex */
public abstract class AbstractC20331w {
    /* renamed from: a */
    public static Object m106026a(Object obj) {
        Throwable th2;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        try {
            if (obj != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    } catch (Throwable th3) {
                        th2 = th3;
                        objectInputStream = null;
                    }
                    try {
                        Object readObject = objectInputStream.readObject();
                        objectOutputStream.close();
                        objectInputStream.close();
                        return readObject;
                    } catch (Throwable th4) {
                        th2 = th4;
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                        if (objectInputStream != null) {
                            objectInputStream.close();
                            throw th2;
                        }
                        throw th2;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    objectInputStream = null;
                    objectOutputStream = null;
                }
            }
        } catch (IOException | ClassNotFoundException unused) {
        }
        return null;
    }

    /* renamed from: b */
    public static String m106027b(String str, String[] strArr, String[] strArr2) {
        AbstractC4205o.m19722k(strArr);
        AbstractC4205o.m19722k(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i11 = 0; i11 < min; i11++) {
            String str2 = strArr[i11];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i11];
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m106028c(Context context, String str, String str2) {
        AbstractC4205o.m19722k(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = AbstractC20321m.m106019a(context);
        }
        return AbstractC20321m.m106020b("google_app_id", resources, str2);
    }
}
