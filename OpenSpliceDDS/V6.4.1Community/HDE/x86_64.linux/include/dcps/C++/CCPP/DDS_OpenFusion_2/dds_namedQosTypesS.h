// -*- C++ -*-
// $Id$

/**
 * Code generated by the The ACE ORB (TAO) IDL Compiler v2.1.1
 * TAO and the TAO IDL Compiler have been developed by:
 *       Center for Distributed Object Computing
 *       Washington University
 *       St. Louis, MO
 *       USA
 *       http://www.cs.wustl.edu/~schmidt/doc-center.html
 * and
 *       Distributed Object Computing Laboratory
 *       University of California at Irvine
 *       Irvine, CA
 *       USA
 * and
 *       Institute for Software Integrated Systems
 *       Vanderbilt University
 *       Nashville, TN
 *       USA
 *       http://www.isis.vanderbilt.edu/
 *
 * Information about TAO is available at:
 *     http://www.cs.wustl.edu/~schmidt/TAO.html
 **/

// TAO_IDL - Generated from
// be/be_codegen.cpp:461

#ifndef _TAO_IDL_DDS_NAMEDQOSTYPESS_QJAWUT_H_
#define _TAO_IDL_DDS_NAMEDQOSTYPESS_QJAWUT_H_


#include "dds_namedQosTypesC.h"
#include "dds_dcps_builtintopicsS.h"
#include "tao/PortableServer/Basic_SArguments.h"
#include "tao/PortableServer/Special_Basic_SArguments.h"
#include "tao/PortableServer/Fixed_Size_SArgument_T.h"
#include "tao/PortableServer/Var_Size_SArgument_T.h"
#include "tao/PortableServer/UB_String_SArguments.h"

#if !defined (ACE_LACKS_PRAGMA_ONCE)
# pragma once
#endif /* ACE_LACKS_PRAGMA_ONCE */


// TAO_IDL - Generated from
// be/be_visitor_arg_traits.cpp:68

TAO_BEGIN_VERSIONED_NAMESPACE_DECL


// Arg traits specializations.
namespace TAO
{

  // TAO_IDL - Generated from
  // be/be_visitor_arg_traits.cpp:941

  template<>
  class SArg_Traits< ::DDS::NamedDomainParticipantQos>
    : public
        Var_Size_SArg_Traits_T<
            ::DDS::NamedDomainParticipantQos,
            TAO::Any_Insert_Policy_Stream
          >
  {
  };

  // TAO_IDL - Generated from
  // be/be_visitor_arg_traits.cpp:941

  template<>
  class SArg_Traits< ::DDS::NamedPublisherQos>
    : public
        Var_Size_SArg_Traits_T<
            ::DDS::NamedPublisherQos,
            TAO::Any_Insert_Policy_Stream
          >
  {
  };

  // TAO_IDL - Generated from
  // be/be_visitor_arg_traits.cpp:941

  template<>
  class SArg_Traits< ::DDS::NamedSubscriberQos>
    : public
        Var_Size_SArg_Traits_T<
            ::DDS::NamedSubscriberQos,
            TAO::Any_Insert_Policy_Stream
          >
  {
  };

  // TAO_IDL - Generated from
  // be/be_visitor_arg_traits.cpp:941

  template<>
  class SArg_Traits< ::DDS::NamedTopicQos>
    : public
        Var_Size_SArg_Traits_T<
            ::DDS::NamedTopicQos,
            TAO::Any_Insert_Policy_Stream
          >
  {
  };

  // TAO_IDL - Generated from
  // be/be_visitor_arg_traits.cpp:941

  template<>
  class SArg_Traits< ::DDS::NamedDataWriterQos>
    : public
        Var_Size_SArg_Traits_T<
            ::DDS::NamedDataWriterQos,
            TAO::Any_Insert_Policy_Stream
          >
  {
  };

  // TAO_IDL - Generated from
  // be/be_visitor_arg_traits.cpp:941

  template<>
  class SArg_Traits< ::DDS::NamedDataReaderQos>
    : public
        Var_Size_SArg_Traits_T<
            ::DDS::NamedDataReaderQos,
            TAO::Any_Insert_Policy_Stream
          >
  {
  };
}

TAO_END_VERSIONED_NAMESPACE_DECL



// TAO_IDL - Generated from
// be/be_visitor_module/module_sh.cpp:38

namespace POA_DDS
{
  

// TAO_IDL - Generated from
// be/be_visitor_module/module_sh.cpp:69

} // module DDS

#endif /* ifndef */

