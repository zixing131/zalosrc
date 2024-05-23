package qn0;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlinx.serialization.KSerializer;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: qn0.g */
/* loaded from: classes7.dex */
public @interface InterfaceC25392g {
    Class with() default KSerializer.class;
}
