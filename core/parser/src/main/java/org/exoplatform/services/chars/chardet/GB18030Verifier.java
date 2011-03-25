/**
 * Copyright (C) 2009 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

/*
 * DO NOT EDIT THIS DOCUMENT MANUALLY !!!
 * THIS FILE IS AUTOMATICALLY GENERATED BY THE TOOLS UNDER
 *    AutoDetect/tools/
 */

package org.exoplatform.services.chars.chardet;

public class GB18030Verifier extends Verifier
{

   public GB18030Verifier()
   {


      cclass = new int[256 / 8];

      cclass[0] =
         ((((((((((((1) << 4) | (1)))) << 8) | (((((1) << 4) | (1))))))) << 16)
             | (((((((((1) << 4) | (1)))) << 8) | (((((1) << 4) | (1)))))))));
      cclass[1] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((1) << 4) | (1))))))) << 16)
             | (((((((((1) << 4) | (1)))) << 8) | (((((1) << 4) | (1)))))))));
      cclass[2] =
         ((((((((((((1) << 4) | (1)))) << 8) | (((((1) << 4) | (1))))))) << 16)
             | (((((((((1) << 4) | (1)))) << 8) | (((((1) << 4) | (1)))))))));
      cclass[3] =
         ((((((((((((1) << 4) | (1)))) << 8) | (((((1) << 4) | (1))))))) << 16)
             | (((((((((0) << 4) | (1)))) << 8) | (((((1) << 4) | (1)))))))));
      cclass[4] =
         ((((((((((((1) << 4) | (1)))) << 8) | (((((1) << 4) | (1))))))) << 16)
             | (((((((((1) << 4) | (1)))) << 8) | (((((1) << 4) | (1)))))))));
      cclass[5] =
         ((((((((((((1) << 4) | (1)))) << 8) | (((((1) << 4) | (1))))))) << 16)
             | (((((((((1) << 4) | (1)))) << 8) | (((((1) << 4) | (1)))))))));
      cclass[6] =
         ((((((((((((3) << 4) | (3)))) << 8) | (((((3) << 4) | (3))))))) << 16)
             | (((((((((3) << 4) | (3)))) << 8) | (((((3) << 4) | (3)))))))));
      cclass[7] =
         ((((((((((((1) << 4) | (1)))) << 8) | (((((1) << 4) | (1))))))) << 16)
             | (((((((((1) << 4) | (1)))) << 8) | (((((3) << 4) | (3)))))))));
      cclass[8] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[9] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[10] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[11] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[12] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[13] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[14] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[15] =
         ((((((((((((4) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[16] =
         ((((((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6))))))) << 16)
             | (((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (5)))))))));
      cclass[17] =
         ((((((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6))))))) << 16)
             | (((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6)))))))));
      cclass[18] =
         ((((((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6))))))) << 16)
             | (((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6)))))))));
      cclass[19] =
         ((((((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6))))))) << 16)
             | (((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6)))))))));
      cclass[20] =
         ((((((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6))))))) << 16)
             | (((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6)))))))));
      cclass[21] =
         ((((((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6))))))) << 16)
             | (((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6)))))))));
      cclass[22] =
         ((((((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6))))))) << 16)
             | (((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6)))))))));
      cclass[23] =
         ((((((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6))))))) << 16)
             | (((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6)))))))));
      cclass[24] =
         ((((((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6))))))) << 16)
             | (((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6)))))))));
      cclass[25] =
         ((((((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6))))))) << 16)
             | (((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6)))))))));
      cclass[26] =
         ((((((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6))))))) << 16)
             | (((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6)))))))));
      cclass[27] =
         ((((((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6))))))) << 16)
             | (((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6)))))))));
      cclass[28] =
         ((((((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6))))))) << 16)
             | (((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6)))))))));
      cclass[29] =
         ((((((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6))))))) << 16)
             | (((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6)))))))));
      cclass[30] =
         ((((((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6))))))) << 16)
             | (((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6)))))))));
      cclass[31] =
         ((((((((((((0) << 4) | (6)))) << 8) | (((((6) << 4) | (6))))))) << 16)
             | (((((((((6) << 4) | (6)))) << 8) | (((((6) << 4) | (6)))))))));

      states = new int[6];

      states[0] =
         ((((((((((((eError) << 4) | (3)))) << 8) | (((((eStart) << 4) | (eStart))))))) << 16)
             | (((((((((eStart) << 4) | (eStart)))) << 8) | (((((eStart) << 4) | (eError)))))))));
      states[1] =
         ((((((((((((eItsMe) << 4) | (eItsMe)))) << 8) | (((((eError) << 4) | (eError))))))) << 16)
             | (((((((((eError) << 4) | (eError)))) << 8) | (((((eError) << 4) | (eError)))))))));
      states[2] =
         ((((((((((((eStart) << 4) | (eError)))) << 8) | (((((eError) << 4) | (eItsMe))))))) << 16)
             | (((((((((eItsMe) << 4) | (eItsMe)))) << 8) | (((((eItsMe) << 4) | (eItsMe)))))))));
      states[3] =
         ((((((((((((eError) << 4) | (eError)))) << 8) | (((((eError) << 4) | (eError))))))) << 16)
             | (((((((((eStart) << 4) | (eStart)))) << 8) | (((((eError) << 4) | (4)))))))));
      states[4] =
         ((((((((((((eError) << 4) | (eItsMe)))) << 8) | (((((eError) << 4) | (eError))))))) << 16)
             | (((((((((eError) << 4) | (5)))) << 8) | (((((eError) << 4) | (eError)))))))));
      states[5] =
         ((((((((((((eStart) << 4) | (eStart)))) << 8) | (((((eStart) << 4) | (eStart))))))) << 16)
             | (((((((((eStart) << 4) | (eStart)))) << 8) | (((((eError) << 4) | (eError)))))))));

      charset = "GB18030";
      stFactor = 7;

   }

}

